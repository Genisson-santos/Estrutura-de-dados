package Lista_encadeada_base;

import Prova2.Fila;
import Prova2.FilaVaziaException;
import Prova2.Pilha;

public class test {
	    public static void main(String[] args) throws FilaVaziaException {
// TESTE LISTA      
	        Lista<Integer> lista = new Lista<Integer>();
	        System.out.println("TESTE LISTA  //////////////////////////////////////////////////// ");
	        System.out.println("");
	        lista.incluir(1);
	        lista.incluir(6);
	        lista.incluir(12);
	        lista.incluirInicio(3);
	        lista.remover_lista(6);
	        
	        System.out.println("Tamanho: " + lista.getTamanho());
	        System.out.println("Primeiro: " + lista.getinicial().getElemento());
	        System.out.println("Último: " + lista.getfim().getElemento());
	        System.out.println("Lista : " + lista.toString()); 
	       
	       System.out.println("TESTE PILHA //////////////////////////////////////////////////// ");
	       System.out.println("");
//TESTE PILHA
	Pilha<Integer> pilha=new Pilha<Integer>();       
	       pilha.empilhar(2);
	       pilha.empilhar(3);
	       pilha.empilhar(7);
	       pilha.desempilhar();
	       System.out.println(pilha.toString());
	       pilha.empilhar(7);
	       System.out.println(pilha.toString());
	       System.out.println("Tamanho: " + pilha.getTamanho());
	       System.out.println("Topo da pilha: " + pilha.getTop());
	       
	       
	       System.out.println("TESTE FILA //////////////////////////////////////////////////// ");
	       System.out.println("");
// TESTE FILA
	       Fila<Integer> filaA =new Fila<Integer>();
	       filaA.incluir(1);
	        filaA.incluir(4);
	        filaA.incluir(7); 
System.out.println("Fila: "+filaA.toString());
System.out.println("Tamanho da fila: "+filaA.getTamanho());
System.out.println("Primeiro da fila: "+filaA.getPrimeiro());
System.out.println("Próximo da fila: "+filaA.visualizarProximo());
	       
	    }
	}

