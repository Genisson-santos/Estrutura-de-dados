package Prova2;

public class Teste_Validar_Expressao_Pilha {
	public static void main(String[] args) {

//Expressão válida

		String expressao = ("A + [ B *(C + D) ] * E");

//Expressão inválida   

		String expressao1 = ("A + B * (C + D] * E");

		Pilha_analizar_expressao expressao_entrada = new Pilha_analizar_expressao(expressao);
		System.out.println(expressao_entrada.toString());
		//System.out.println(expressao_entrada.validarExpressao());
					
		Pilha_analizar_expressao expressao_entrada1 = new Pilha_analizar_expressao(expressao1);
		System.out.println(expressao_entrada1.toString());
		// System.out.println(expressao_entrada1.validarExpressao());


	}
}
