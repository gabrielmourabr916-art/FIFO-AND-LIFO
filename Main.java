public class Main {
    public static void main(String[] args) {
       
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

              lista.adicionar(1);

               System.out.println(lista);
    }
}

public class ListaEncadeada<T> {

       private No<T> inicio;

       public void adicionar(T elemento) {
            
 No<T> celula = new No<>(elemento);

       
        this.inicio = celula;
    }

       @Override
    public String toString() {
               StringBuilder builder = new StringBuilder();

             builder.append("ListaEncadeada [inicio=").append(inicio).append("]");

              return builder.toString();
    }
}

public class No<T> {

    private T elemento;
    private No<T> proximo;

       public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null; // Inicialmente, o próximo nó é nulo
    }

       public T getElemento() {
        return elemento;
    }

      public void setElemento(T elemento) {
        this.elemento = elemento;
    }

  
    public No<T> getProximo() {
        return proximo;
    }

   
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

      @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", proximo=" + proximo + '}';
    }
}
