import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArbolL arbol = new ArbolL();

        int opcion;

        do {

            System.out.println("\nMenú Biblioteca");
            System.out.println("1. Insertar libro");
            System.out.println("2. Buscar ISBN");
            System.out.println("3. Imprimir catalogo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    
                    if (arbol.existeISBN(isbn)) {
                        System.out.println("Ese ISBN ya existe");
                    } else {

                        System.out.print("Ingrese titulo: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Ingrese autor: ");
                        String autor = scanner.nextLine();

                        System.out.print("Ingrese año de publicacion: ");
                        int anio = scanner.nextInt();

                        arbol.insertar(isbn, titulo, autor, anio);

                        System.out.println("Libro registrado correctamente");
                    }

                    break;

                case 2:

                    System.out.print("Ingrese ISBN a buscar: ");
                    long buscar = scanner.nextLong();

                    if (arbol.existeISBN(buscar)) {
                        System.out.println("El ISBN SI existe en el catalogo");
                    } else {
                        System.out.println("El ISBN NO existe");
                    }

                    break;

                case 3:

                    arbol.imprimirCatalogo();

                    break;

                case 4:

                    System.out.println("Saliendo del sistema");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);

        scanner.close();
    }
    
}
