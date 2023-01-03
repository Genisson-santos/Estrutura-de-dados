package Prova2;

public class Teste_Fila_saoIguais {
	   public static void main(String[] args) {
	        Fila<Integer> fila1 =new Fila<Integer>();
	        Fila<Integer> fila2 =new Fila<Integer>();
//modificar os conteudos das listas pra testar se são iguais;

	 //////FILA 1 :      
	        fila1.incluir(1);
	        fila1.incluir(3);
	        fila1.incluir(7);
	        fila1.incluir(9);
	       fila1.incluir(15);
	       fila1.incluir(19);
	   //FILA 2 :    
	        fila2.incluir(1);
	        fila2.incluir(3);
	        fila2.incluir(7);
	        fila2.incluir(9);
	        fila2.incluir(15);
	        fila2.incluir(19);
	// CHAMA O METODO SÃO IGUAIS + TOSTRING();        
	      fila1.saoIguais(fila1, fila2);
	      //fila2.saoIguais(fila2, fila1);

	
	      
	   
	    }
}
