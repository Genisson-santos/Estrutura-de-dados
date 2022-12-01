package lista;

public class ListaEncOrdenada <T extends Comparable<T>> extends ListaEnc<T>{
	protected int tamanho;
	No<T> inicio;
	No<T> fim;
	
	 public ListaEncOrdenada() {
		 this.inicio = null;
	 }
    @Override
    public void incluir(T elemento)  {
    	
        No<T> novoNo =new No<>(elemento);
        if(EstaVazia()) {
        	inicio=novoNo;
        }else {
            fim.setProxNo(novoNo);;
        }
        fim = novoNo;
        tamanho++;  
         }
    public void IncluirOrdenado(T elemento){
        No<T> novo = new No<T>();
        No<T> atual = this.inicio;
        No<T>anterior = null;
        novo.setElemento( elemento);

        if(atual == null){
            novo.setProxNo(null);
            this.inicio = novo;
            this.fim = inicio;
        } else {
            while (atual != null && elemento.compareTo(atual.getElemento()) > 0){
                anterior = atual;
                atual = atual.getProxNo();
            }
            novo.setProxNo(atual);
            if(anterior == null){
                this.inicio = novo;
            } else {
                anterior.setProxNo(novo);
            }
        }
        this.tamanho++;
    }
    @Override
    public void incluirInicio(T elemento)   {
    	
    	 No<T> noAux = new No<>(elemento);
         if (EstaVazia()) {
             inicio = noAux;
             fim = noAux;
         } else {
             noAux.setProxNo(noAux);
             inicio = noAux;
         }
         tamanho++;
         
        }
    public void AdcionarFinal(T elemento) {
   	 No<T> novo = new No<T>();
        novo.setElemento(elemento);
        if (EstaVazia()) {
            inicio = novo;
            fim = inicio;
            tamanho++;
        } else {
            fim.setProxNo(novo);
            fim = novo;
            tamanho++;
        }
       }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
    	if (posicao < 0 || posicao > tamanho) {
            throw new Exception("Posição solicitada não existe na lista");
        }
        if (posicao == 0) {
            incluirInicio(elemento);
        } else if (posicao == tamanho) {
            incluir(elemento);
        } else {
            No<T> Aux = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                Aux = Aux.getProxNo();
            }
            No<T> noTemp = new No<>(elemento);
            noTemp.setProxNo(Aux.getProxNo());
            Aux.setProxNo(noTemp);
            tamanho++;
        }
        }

    @Override
    public T get(int posicao) throws Exception {
    	
    	if (posicao < 0 || posicao >= getTamanho()) {		
        	throw new Exception("Posição solicitada não existe na lista");
        	}
        	
        	if (posicao == getTamanho() - 1) {
                return fim.getElemento();
            }
        	
        	No<T> Aux = inicio;
            for (int i = 0; i < posicao; i++) {
                Aux = Aux.getProxNo();
            }
            return Aux.getElemento();
        }

    @Override
    public int getPosElemento(T elemento) throws Exception {
    	
    	  int posicao = 0;
          No<T> noAux = inicio;
          while (noAux!= null){
              if(noAux.getElemento()==elemento){
                  return posicao;
              }else if(noAux.getElemento().compareTo(elemento) > 0){
                  throw new Exception("Elemento não encontrado");
              }
              else{
                  noAux = noAux.getProxNo();
                  posicao++;
              }
          }
          throw new Exception("Elemento não encontrado");
    }

    @Override
    public void remover(int posicao) throws Exception {
    	if (posicao < 0 || posicao >= tamanho) {
            throw new Exception("Posição solicitada não existe na lista");     }
    	
    	if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else if (posicao == 0) {
            inicio = inicio.getProxNo();
        } else if (posicao == tamanho - 1) {
            No<T> Aux = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                Aux = Aux.getProxNo();
            }
            fim = Aux;
            fim.setProxNo(null);
        } else {
            No<T> noAux = inicio;
            No<T> noTemp = null;
            for (int i = 0; i < posicao; i++) {
                noTemp = noAux;
                noAux = noAux.getProxNo();
            }
            noTemp.setProxNo(noAux.getProxNo());
        }
        tamanho--;
    }

    @Override
    public void limpar() {
    	inicio = null;
    	tamanho=0;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean contem(T elemento)  {
    	No<T> auxiliar = inicio;
        while (auxiliar!= null){
            if(auxiliar.getElemento() == elemento){
                return true;
            }else{
                auxiliar = auxiliar.getProxNo();
            }
        }
        return false;
        
    }
}
