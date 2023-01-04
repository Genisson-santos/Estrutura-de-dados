package Prova2;

public  interface IFila <T> {
	
public void incluir (T Elemento );
public void remover ( ) ;
 public boolean estaVazia ( ) ;
public void limpar ( ) ;
public T visualizarProximo ( ) throws FilaVaziaException ;
public int getTamanho();
public Object getPrimeiro();
}
