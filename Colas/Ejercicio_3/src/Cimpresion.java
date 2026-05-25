public class Cimpresion {
     private Documento frente;
    private Documento fin;

    public Cimpresion() {

        frente = null;
        fin = null;
    }


    public void agregarDocumento( String archivo,String usuario,int paginas,boolean color) {

        Documento nuevo =
            new Documento(archivo,usuario, paginas,color);

        if (frente == null) {

            frente = nuevo;
            fin = nuevo;

        } else {

            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nDocumento agregado.");
    }

    public Documento imprimirDocumento() {

        if (frente == null) {
            return null;
        }

        Documento aux = frente;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return aux;
    }

    public void mostrarCola() {

        if (frente == null) {

            System.out.println("\nNo hay documentos");
            return;
        }

        Documento aux = frente;

        System.out.println( "\nCola de impresion");

        while (aux != null) {

            System.out.println(
                "---");

            System.out.println("Archivo: "+ aux.nombreArchivo);

            System.out.println(
                "Usuario: "
                + aux.usuario);

            System.out.println("Paginas: "+ aux.numeroPaginas);

            System.out.println("Color: "+ aux.esColor);

            aux = aux.siguiente;
        }
    }

    public int calcularPaginasTotales() {

        int total = 0;

        Documento aux = frente;

        while (aux != null) {

            total += aux.numeroPaginas;

            aux = aux.siguiente;
        }

        return total;
    }

}
