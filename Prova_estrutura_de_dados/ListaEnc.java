package Prova_estrutura_de_dados;

public class ListaEnc<T> {
		private No<T> inicial;
	    private No<T> fim;
	    private int tamanho;
	    
	    public ListaEnc(){
	        this.tamanho = 0;
	    }

	    public No<T> getinicial() {
	        return inicial;
	    }

	    public void setinicial(No<T> inicial) {
	        this.inicial = inicial;
	    }

	    public No<T> getfim() {
	        return fim;
	    }

	    public void setfim(No<T> fim) {
	        this.fim = fim;
	    }

	    public int getTamanho() {
	        return tamanho;
	    }

	    public void setTamanho(int tamanho) {
	        this.tamanho = tamanho;
	    }
	    
	    public boolean estaVazia() {
	        if(inicial == null) {
	        	return true;
	        }else {
	        	return false;
	        }  	
	    }
	    
	    public void incluirInicio(T elemento) {
	        No<T> noAuxiliar = new No<>(elemento);
	        if (estaVazia()) {
	            inicial = noAuxiliar;
	            fim = noAuxiliar;
	        } else {
	            noAuxiliar.setProximo(inicial);
	            inicial = noAuxiliar;
	        }
	        tamanho++;
	    }
	  
	    public void incluir(T Elemento){
	        No<T> novoElemento = new No<T>(Elemento);
	        if (this.inicial == null && this.fim == null){
	            this.inicial = novoElemento;
	            this.fim = novoElemento;            
	        }else{
	            this.fim.setProximo(novoElemento);
	            this.fim = novoElemento;            
	        }
	        this.tamanho++;
	    }
	    
	    public void remover(T elementoProcurado){
	       No<T> anterior = null;
	       No<T> atual = this.inicial;
	        for(int i=0; i < this.getTamanho(); i++){            
	            if (atual.getElemento().equals(elementoProcurado)){
	                if (this.tamanho == 1){
	                    this.inicial = null;
	                    this.fim = null;
	                }else if (atual == inicial){
	                    this.inicial = atual.getProximo();
	                    atual.setProximo(null);
	                }else if (atual == fim){
	                    this.fim = anterior;
	                    anterior.setProximo(null);
	                }else{
	                    anterior.setProximo(atual.getProximo());
	                    atual = null;
	                }
	                this.tamanho--;
	                break;
	            }
	            anterior = atual;
	            atual = atual.getProximo();
	        }
	    }
	    
	    public No<T> get(int posicao){
	       No <T>atual = this.inicial;
	        for(int i=0; i < posicao; i++){
	            if (atual.getProximo() != null){
	                atual = atual.getProximo();
	            }
	        }
	        return atual;
	    }
	}

