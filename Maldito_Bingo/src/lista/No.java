package lista;

public class No<T> {
    public T elemento;
    public No<T> proxNo;
    private No<T> anterior;
    
	public No() {
		this.proxNo =null;
	}


	public No(T elemento) {
		this.proxNo =null;
		this.elemento = elemento;
		this.setAnterior(null);
		
	}
	public No(T elemento, No<T> proxNo,No<T> anterior) {
		this.elemento = elemento;
		this.proxNo = proxNo;
		this.setAnterior(anterior);
	}


	public T getElemento() {
		return elemento;
	}


	public void setElemento(T elemento) {
		this.elemento = elemento;
	}


	public No<T> getProxNo() {
		return proxNo;
	}


	public void setProxNo(No<T> proxNo) {
		this.proxNo = proxNo;
	}


	@Override
	public String toString() {
		
		return "No [elemento=" + elemento + "]";
	}


	public No<T> getAnterior() {
		return anterior;
	}


	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}
    
}
