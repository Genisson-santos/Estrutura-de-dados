package Prova2;

public class Teste_Validar_Expressao_Pilha {
	public static void main(String[] args) {

//Express�o v�lida

		String expressao = ("A + [ B *(C + D) ] * E");

//Express�o inv�lida   

		 //String expressao = ("A + B * (C + D] * E");

		Pilha_analizar_express�o expressao_entrada = new Pilha_analizar_express�o(expressao);
		System.out.println(expressao_entrada.toString());
		//System.out.println(expressao_entrada.validarExpressao());
		
		if (expressao_entrada.validarExpressao()) {
			System.out.println("Express�o valida!");
		} else {
			System.out.println("Express�o invalida!");
		}
	}

}
