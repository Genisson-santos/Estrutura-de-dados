package Prova2;

public class Pilha_analizar_expressao {

	private String expressao;
	
// STRING QUE RECEBE A EXPRESSÃO A SER ANALIZADA
	
	public Pilha_analizar_expressao(String Expressao) {
		this.expressao = Expressao;
	}
	public String getExpressao() {
		return expressao;
	}

	public boolean validarExpressao() {
		Pilha pilha = new Pilha();

		for (int i = 0; i < this.expressao.length(); i++) {
		//SE FOR UM SIMBOLO DE ABRIR (,[,{ EMPILHAR	
			if (this.expressao.charAt(i) == '{' || this.expressao.charAt(i) == '[' || this.expressao.charAt(i) == '(') {
				pilha.empilhar(this.expressao.charAt(i));
		// SE FOR UM SIMBOLO DE FECHAR E A PILHA TIVER VAZIA RETORNAR FALSO
			} else if (this.expressao.charAt(i) == ')' || this.expressao.charAt(i) == ']'|| this.expressao.charAt(i) == '}') {
				if (pilha.estaVazia()) {
					return false;
		// SE O SIMBOLO DE FECHAMENTO NA POSIÇÃO i FOR "PAR" DO SIMBOLO NO  TOPO DA PILHA DESEMPILHA
				} else if (this.expressao.charAt(i) == ')' && pilha.getTop().equals('(')) {
					pilha.desempilhar();

					continue;
				} else if (this.expressao.charAt(i) == ']' && pilha.getTop().equals('[')) {
					pilha.desempilhar();

					continue;
				} else if (this.expressao.charAt(i) == '}' && pilha.getTop().equals('{')) {
					pilha.desempilhar();
					;
					continue;
				}
				return false;
			}
		}
		//SE NO FINAL A PILHA ESTIVER VAZIA A EXPRESSÃO É VALIDA , CASO CONTRARIO É INVALIDA
		if (pilha.estaVazia()) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Analizar Expressão: " + expressao + " ";
	}

}
