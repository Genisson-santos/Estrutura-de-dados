package Prova2;

import Lista_encadeada_base.Lista;

public class Pilha<T> {
	@Override
	public String toString() {
		return "Pilha :" + pilha ;
	}

	private Lista<T> pilha;
	
public Pilha () {
	this.pilha = new Lista();
}

public void empilhar(T novoElemento) {
	this.pilha.incluirInicio(novoElemento);
	
}
public void desempilhar() {
	this.pilha.remover_lista(pilha.getinicial().getElemento());
}
public T getTop() {
	return this.pilha.getinicial().getElemento();
}
public int getTamanho() {
	return this.pilha.getTamanho();
}

public boolean estaVazia() {	
	 if(pilha.getinicial() == null) {
	    	return true;
	    }else {
	    	return false;
	    }  	
	 }
}
