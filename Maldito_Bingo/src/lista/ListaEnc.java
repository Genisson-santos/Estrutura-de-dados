package lista;


public class ListaEnc<T extends Comparable<T>> extends Lista<T> {
	
	protected int tamanho;
	No<T> inicio;
	No<T> fim;
	
    public ListaEnc(){
    this.inicio = null;
    
    }

public boolean EstaVazia() {
	return inicio==null;
}
@Override
public int getTamanho() {
    return this.tamanho;
}


    @Override
    public void incluir(T elemento) {
        No<T> novoNo =new No<>(elemento);
        if(EstaVazia()) {
        	inicio=novoNo;
        }else {
            fim.setProxNo(novoNo);;
        }
        fim = novoNo;
        tamanho++;  
          }

    public T get(int posicao)  throws Exception {
    	
    	if (posicao < 0 || posicao >= tamanho) {		
    	throw new Exception("Posição solicitada não existe na lista");
    	}
    	
    	if (posicao == tamanho - 1) {
            return fim.getElemento();
        }
    	
    	No<T> Aux = inicio;
        for (int i = 0; i < posicao; i++) {
            Aux = Aux.getProxNo();
        }
        return Aux.getElemento();
    }


    public int getPosElemento(T elemento)  throws Exception {
    	 int posicao = 0;
         No<T> Aux =inicio;
         
         while (Aux!= null){
             if(Aux.getElemento()==elemento){
                 return posicao;
             }else{
                Aux = Aux.getProxNo();
                 posicao++;
             } 	
    }
         throw new Exception("Elemento não localizado");
    }
    
    protected No<T> getNo(int posicao) {
       if(posicao>= tamanho) {
    	   int ultimaPos = tamanho-1;
    	   throw new IndexOutOfBoundsException("Não existe conteudo nessa posição");  
       }
        No<T> noAux = inicio;
        No<T> noRetorno = null;
        for (int i = 0; i <= posicao; i++) {
            noRetorno = noAux;
            noAux = noAux.getProxNo();
        }
        return noRetorno;
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


    public void limpar() {
    	   this.inicio = null;
           this.tamanho = 0;
    }



    @Override
    public boolean contem(T elemento){
    	
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
	 public String toString(){
	        if(EstaVazia()) {
	            return "Lista  Encadeada []";
	        }
	        String print = "Lista Encadeada [ ";
	        No<T> aux;
	        for (aux = inicio; aux != fim; aux = aux.getProxNo()) {
	            print = print + aux.getElemento() + ", ";
	        }
	        return print + aux.getElemento() + " ] - Tamanho = " + tamanho;
	    } 
}
