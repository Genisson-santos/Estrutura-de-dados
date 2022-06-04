package Prova_estrutura_de_dados;

public class teste_lista {

	public static void main(String[] args) {
		 ListaEnc<Integer> lista = new ListaEnc<Integer>();
	        lista.incluir(3);
	        lista.incluir(4);
	        lista.incluir(5);
	        lista.remover(5);
	        lista.incluir(3);
	        lista.incluir(4);
	        lista.incluir(5);
	        lista.incluirInicio(6);
	        lista.incluirInicio(8);
	        System.out.println("lista vazia? :"+ lista.estaVazia());
	        System.out.println("Tamanho da lista: " + lista.getTamanho());
	        for(int i=0; i < lista.getTamanho(); i++){
	            System.out.println(lista.get(i).getElemento());
	        }
	    
	        
	    }
	    
	}
	
