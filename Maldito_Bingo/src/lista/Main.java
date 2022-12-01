package lista;

public class Main {

	public static void main(String[] args) throws Exception  {
		 ListaEnc lista =new ListaEnc();
		 
		 lista.incluir(5);
		 lista.incluir(7);
		 lista.incluir(8, 1);
		lista.AdcionarFinal(3);
		lista.remover(0);
		lista.AdcionarFinal(5);
		 System.out.println(lista.toString());
		    }

		

	}


