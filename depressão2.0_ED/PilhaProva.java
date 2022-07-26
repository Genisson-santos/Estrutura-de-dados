package Prova2_ED;

public class PilhaProva<T> {
	 private int[] pilha;
	    private int Topo;
	    private int ultimo;
	    private int total;
	   
	    public PilhaProva(){
	       pilha = new int[5];
	       Topo = -1;
	     
	    }
	    
	    public void Empilhar(int elemento) {
	    	if(estaCheia()) {
	    		throw new RuntimeException("Erro de pilha cheia");
	    	}
	      Topo++;
	      pilha[Topo]=elemento;
	      
	    }
	    
	    public int Desemplhar(){
	    	if(estaVazia()) {
	    		throw new RuntimeException("Erro de pilha vazia");
	    	}
	    	int elemento = pilha[Topo];
	    	Topo--;
	        return elemento;
	    }
	    
	    public boolean estaCheia(){
	        return (Topo==pilha.length);
	    }
	    public boolean estaVazia(){
	        return (Topo==-1) ;
	    }
	}

