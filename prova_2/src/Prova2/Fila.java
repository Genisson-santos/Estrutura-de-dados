package Prova2;

import Lista_encadeada_base.Lista;

public class Fila<T> implements IFila<T>{
private Lista<T>  fila;



public Fila() {
	this.fila = new Lista();
}


public void incluir(T Elemento) {
	this.fila.incluir(Elemento);
}

public void remover() {
this.fila.remover_lista(fila.getinicial().getElemento());
	}

public boolean saoIguais(Fila<T> fila1, Fila<T> fila2) {
	// filas auxiliares pra guardar informa��o
	 Fila filaux1 =new Fila();
     Fila filaux2 =new Fila();
     int tamanhoaux =fila1.getTamanho();
     //se o tamanho das filas for diferente retorna falso
	 if (fila1.getTamanho()!= fila2.getTamanho()||fila2.getTamanho()!= fila1.getTamanho()) {
		 System.out.println("As filas N�o S�o Iguais / TAMANHOS DIFERENTES");
		 System.out.println("Fila 1: "+fila1.toString());
			System.out.println("Fila 2: "+fila2.toString());
         return false;   
	}
	 //emquanto as filas estiverem cheias vai incluir os elementos da fila original na auxiliar
	 
	 //comparar se o primeiro elemento das duas filas s�o iguais, se for desempilha
	 
	 //se as filas originais estiverem vaizas significa que as filas sa� iguais retorna verdadeiro
	 
	 //e se os primeiros das filas forem diferentes retorna falso;
	 
	 while(!fila1.estaVazia() && !fila2.estaVazia()) {
		 filaux1.incluir(fila1.getPrimeiro());
	     filaux2.incluir(fila2.getPrimeiro());
	    
		 if(fila1.getPrimeiro()==fila2.getPrimeiro()||fila2.getPrimeiro()==fila1.getPrimeiro()) {
			 fila1.remover();
			 fila2.remover();
			 if(fila1.estaVazia()  && fila2.estaVazia() ){
				 System.out.println("As filas S�o Iguais");
				 System.out.println("Tamanho das filas: "+tamanhoaux);
				System.out.println("Fila 1: "+filaux1.toString());
				System.out.println("Fila 2: "+filaux2.toString());
				 return true;
				 }
			 }
		 if(fila1.getPrimeiro()!=fila2.getPrimeiro()||fila2.getPrimeiro()!=fila1.getPrimeiro()) {
			 if(tamanhoaux!=fila1.getTamanho()||tamanhoaux==fila1.getTamanho()||tamanhoaux!=fila2.getTamanho()||tamanhoaux==fila2.getTamanho() ) { 
			 System.out.println("As filas N�o S�o Iguais / CONTEUDO DIFERENTE");
			 System.out.println("Tamanho das filas: "+tamanhoaux);
			 System.out.println("Fila 1: "+filaux1.toString()+fila1.toString());
				System.out.println("Fila 2: "+filaux2.toString()+fila2.toString());
				return false;
				}
			}
		 }
	
	return false;
	
	}
	 
public String toString() {
	return "" +fila ;
}


public boolean estaVazia() {
	return this.fila.estaVazia();
}

public void limpar() {
	this.fila.limpar();
}

public T getPrimeiro() {
return this.fila.getinicial().getElemento();
}

public int getTamanho() {
	return this.fila.getTamanho();
}

public T visualizarProximo()throws FilaVaziaException{
	 if(fila.estaVazia()) {
			throw new FilaVaziaException();
		}
 return this.fila.getauxi().getElemento();

}
	
	}
