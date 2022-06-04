package Prova_estrutura_de_dados;

public class ListaEncOrdenada <T extends Comparable<T>> extends ListaEnc<T>{
	
	 
	public void incluir(T Elemento) {
		super.incluir(Elemento);
		}

	public void incluirInicio(T elemento) {
		super.incluirInicio(elemento);
	}
	public void remover(T elementoProcurado) {
		super.remover(elementoProcurado);
	}

	public No<T> get(int posicao) {
		return super.get(posicao);
	}

   
	
}
