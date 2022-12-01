package lista;

public class ListaEncOrdenadaInteiro extends ListaEncOrdenada<Integer>{
	protected No<Integer> inicio;
 
    
    
    public ListaEncOrdenadaInteiro() {
        this.inicio = null;
    }
    @Override
    public void incluir(Integer elemento)  {
    	
    	 No<Integer> novoNo =new No<>(elemento);
         if(EstaVazia()) {
         	inicio=novoNo;
         }else {
             fim.setProxNo(novoNo);;
         }
         fim = novoNo;
         tamanho++;  
     
    }
    public void IncluirOrdenado(Integer elemento){
        No<Integer> novo = new No<Integer>();
        No<Integer> atual = this.inicio;
        No<Integer>anterior = null;
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
    public void incluirInicio(Integer elemento)  {
    	
    	 No<Integer> noAux = new No<>(elemento);
         if (EstaVazia()) {
             inicio = noAux;
             fim = noAux;
         } else {
             noAux.setProxNo(noAux);
             inicio = noAux;
         }
         tamanho++;
    }
    public void AdcionarFinal(Integer elemento) {
      	 No<Integer> novo = new No<Integer>();
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
    public void incluir(Integer elemento, int posicao) throws Exception {
    	
    	if (posicao < 0 || posicao > tamanho) {
            throw new Exception("Posição solicitada não existe na lista");
        }
        if (posicao == 0) {
            incluirInicio(elemento);
        } else if (posicao == tamanho) {
            incluir(elemento);
        } else {
            No<Integer> Aux = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                Aux = Aux.getProxNo();
            }
            No<Integer> noTemp = new No<>(elemento);
            noTemp.setProxNo(Aux.getProxNo());
            Aux.setProxNo(noTemp);
            tamanho++;
        }
    }

    @Override
    public Integer get(int posicao) throws Exception {
    	if (posicao < 0 || posicao >= getTamanho()) {		
        	throw new Exception("Posição solicitada não existe na lista");
        	}
        	
        	if (posicao == getTamanho() - 1) {
                return fim.getElemento();
            }
        	
        	No<Integer> Aux = inicio;
            for (int i = 0; i < posicao; i++) {
                Aux = Aux.getProxNo();
            }
            return Aux.getElemento();
        }

    @Override
    public int getPosElemento(Integer elemento) throws Exception {
    	  int posicao = 0;
          No<Integer> noAux = inicio;
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
            No<Integer> Aux = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                Aux = Aux.getProxNo();
            }
            fim = Aux;
            fim.setProxNo(null);
        } else {
            No<Integer> noAux = inicio;
            No<Integer> noTemp = null;
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
    public boolean contem(Integer elemento) {
    	
    	No<Integer> auxiliar = inicio;
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
