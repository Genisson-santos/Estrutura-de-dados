package Prova2_ED;

public class Teste {

    public static void main(String[] args) {
        FilaProva fila = new FilaProva();
        
        fila.adicionar(1);
        fila.adicionar(5);
        fila.adicionar(7);
        fila.adicionar(8);
        fila.adicionar(5);
        //fila.adicionar(5); forçar erro de fila cheia
     
     while (!fila.estaVazia()) {
    	 int elemento =fila.remover();
    	 System.out.println("elemento "+ elemento+" removido");
    	// fila.remover();
    	//fila.remover(); forçar erro de fila vazia
     }
     System.out.println("");
        PilhaProva pilha = new PilhaProva();
        pilha.Empilhar(1);  
        pilha.Empilhar(5);  
        pilha.Empilhar(6);  
        pilha.Empilhar(4);
        pilha.Empilhar(5);  
       // pilha.Empilhar(6); forçar erro de pilha cheia
        
        while (!pilha.estaVazia()) {
       	 int elemento =pilha.Desemplhar();
       	 System.out.println("elemento "+ elemento+" desempilhado");
      //pilha.Desemplhar(); forçar erro de pilha vazia
       //	 pilha.Desemplhar();
       
    
        }
        
    }    
}