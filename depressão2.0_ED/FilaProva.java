package Prova2_ED;

public class FilaProva<T> {
    private int[] fila;
    private int primeiro;
    private int ultimo;
    private int total;
   
    public FilaProva(){
       fila = new int[5];
       primeiro = 0;
       ultimo= 0;
       total = 0;
    }
    
    public void adicionar(int elemento) {
    	if(estaCheia()) {
    		throw new RuntimeException("Erro de fila cheia");
    	}
       fila[ultimo]=elemento;
       ultimo=(ultimo+1)%fila.length;
       total++;
    }
    
    public int remover(){
    	if(estaVazia()) {
    		throw new RuntimeException("Erro de fila vazia");
    	}
    	int elemento=fila[primeiro];
        primeiro=(primeiro+1)%fila.length;
        total--;
        return elemento;
    }
    
    public boolean estaCheia(){
        return total==fila.length;
    }
    public boolean estaVazia(){
        return total==0 ;
    }
}