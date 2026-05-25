import java.util.Scanner;

public class App {
    public static void menu() {

        System.out.println( "\nImpresora");

        System.out.println( "1. Agregar documento");

        System.out.println( "2. Mostrar cola");

        System.out.println("3. Calcular paginas totales");

        System.out.println( "4. Imprimir documento");

        System.out.println("5. Salir");

        System.out.print( "Seleccione: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cimpresion cola = new Cimpresion();

        int opcion;

        do {

            menu();

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){

                case 1:

                    System.out.print("Nombre archivo: ");

                    String archivo = scanner.nextLine();

                    System.out.print( "Usuario: ");

                    String usuario = scanner.nextLine();

                    System.out.print("Numero paginas: ");

                    int paginas = scanner.nextInt();

                    System.out.print("Es a color (true o false): ");

                    boolean color =scanner.nextBoolean();

                    cola.agregarDocumento(archivo, usuario,paginas, color);

                    break;

                case 2:

                    cola.mostrarCola();

                    break;

                case 3:

                    int total =  cola.calcularPaginasTotales();

                    System.out.println("\nPaginas pendientes: " + total);

                    break;

                case 4:

                    Documento impreso =cola.imprimirDocumento();

                    if (impreso == null) {

                        System.out.println("\nNo hay documentos.");

                    } else {

                        System.out.println("\nDocumento impreso:");

                        System.out.println(impreso.nombreArchivo);
                    }

                    break;

                case 5:

                    System.out.println("\nPrograma finalizado");

                    break;

                default:

                    System.out.println("\nOpcion invalida");
            }

        } while(opcion != 5);

        scanner.close();
    }
}
