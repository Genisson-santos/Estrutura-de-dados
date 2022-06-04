package Prova_estrutura_de_dados;

public class No<T> {
    T elemento;
    private No<T> proximo;
    
    public No(T novoElemento){
        this.elemento = novoElemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T valor) {
        this.elemento = valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

}