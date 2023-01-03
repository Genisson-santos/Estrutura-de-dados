package Prova2;

public class Teste_Validar_Expressao_Pilha {
	public static void main(String[] args) {

//Expressão válida

		String expressao = ("A + [ B *(C + D) ] * E");

//Expressão inválida   

		 //String expressao = ("A + B * (C + D] * E");

		Pilha_analizar_expressão expressao_entrada = new Pilha_analizar_expressão(expressao);
		System.out.println(expressao_entrada.toString());
		//System.out.println(expressao_entrada.validarExpressao());
		
		if (expressao_entrada.validarExpressao()) {
			System.out.println("Expressão valida!");
		} else {
			System.out.println("Expressão invalida!");
		}
	}

}
