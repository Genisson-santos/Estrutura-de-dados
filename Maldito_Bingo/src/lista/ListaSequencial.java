package lista;

public class ListaSequencial<T extends Comparable<T>> extends Lista<T>{


    T[] lista;
    int qtdMax;
    int finalLista;
    
    public ListaSequencial(Class<T> dataType){
        super();
        qtdMax = 10;
        this.lista = (T[]) java.lang.reflect.Array.newInstance(dataType, qtdMax);
        finalLista = -1;
    }

    @Override
    public void limpar() {
        finalLista = -1;
    }
    @Override
    public T get(int posicao) throws Exception {
    	if(posicao < 0 || posicao >= getTamanho()){
            throw new Exception("Posição não existe");
        }
        return lista[posicao];
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
    	for(int i = 0; i<=getTamanho();i++){
    	if(elemento==lista[i]){
    	return i;
    	         }
    	      }
    	      throw new Exception(".");
    	    }

    @Override
    public void incluir(T elemento) throws Exception {
    	if(getTamanho() == qtdMax){
            throw new Exception("Lista Cheia");
          }
          lista[getTamanho()] = elemento; 
          this.finalLista++;
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
    	 if(getTamanho() == qtdMax){
    	        throw new Exception("Lista Cheia");
    	      }
    	      for(int i = finalLista+1; i>0 ; i--){
    	        lista[i] = lista[i-1];
    	      }
    	      lista[0]=elemento;
    	      this.finalLista++;
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
    	  if(getTamanho() == qtdMax){
    	        throw new Exception("Lista Cheia");
    	      }
    	      if(posicao < 0 || posicao > getTamanho()){
    	        throw new Exception("Posicao não existe");
    	      }
    	      if(posicao == getTamanho()){
    	        lista[getTamanho()] = elemento; 
    	        this.finalLista++;
    	        return;
    	      }
    	      for(int i = finalLista+1; i<posicao;i--){
    	        lista[i] = lista[i-1];
    	      }
    	      lista[posicao]=elemento;
    	      this.finalLista++;
    	    }

    @Override
    public void remover(int posicao) throws Exception {
    	 if(posicao < 0 || posicao > getTamanho()){
             throw new Exception("Posicao não existe");
       }
       if(getTamanho() == 0){
         limpar();
         return;
       }
       for(int i = posicao; i<finalLista;i++){
         lista[i] = lista[i+1];
       }
       lista[finalLista]=null;
       this.finalLista--;
    }
    @Override
    public int getTamanho() {
        return finalLista+1;    }

    @Override
    public boolean contem(T elemento) throws Exception {
    	  for(int i = 0; i<getTamanho();i++){
    	         if(elemento.equals(lista[i])){
    	            return true;
    	         }
    	      }
    	      return false;
    }
}

