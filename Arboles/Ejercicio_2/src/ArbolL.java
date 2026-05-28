public class ArbolL {
    Libro raiz;

    public void insertar(long isbn, String titulo, String autor, int anio) {
        raiz = insertarRec(raiz, isbn, titulo, autor, anio);
    }

    private Libro insertarRec(Libro nodo, long isbn, String titulo, String autor, int anio) {

   
        if (nodo == null) {
            return new Libro(isbn, titulo, autor, anio);
        }

     
        if (isbn < nodo.isbn) {
            nodo.izquierda = insertarRec(nodo.izquierda, isbn, titulo, autor, anio);
        }

        else if (isbn > nodo.isbn) {
            nodo.derecha = insertarRec(nodo.derecha, isbn, titulo, autor, anio);
        }

        return nodo;
    }


    public boolean existeISBN(long isbn) {
        return buscarRec(raiz, isbn);
    }

    private boolean buscarRec(Libro nodo, long isbn) {

      
        if (nodo == null) {
            return false;
        }

  
        if (nodo.isbn == isbn) {
            return true;
        }

        if (isbn < nodo.isbn) {
            return buscarRec(nodo.izquierda, isbn);
        }

       
        return buscarRec(nodo.derecha, isbn);
    }

   
    public void imprimirCatalogo() {
        System.out.println("\nCatalogo Ordenado");
        inOrden(raiz);
    }

    private void inOrden(Libro nodo) {

        if (nodo != null) {

            inOrden(nodo.izquierda);

            System.out.println( nodo.isbn + " - "+ nodo.titulo + " - " + nodo.autor
            );

            inOrden(nodo.derecha);
        }
    }

}
