import java.util.Scanner;

public class App {

    
    public static void menu(){
        System.out.println("\nFabrica de Pedidos ");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Procesar pedidos");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        Cpedidos cola=new Cpedidos();

        int op;

        do{
            menu();

            op=scanner.nextInt();
            scanner.nextLine();

            switch(op){

                case 1:

                    System.out.print("Numero pedido: ");
                    String numero=scanner.nextLine();

                    System.out.print("Cliente: ");
                    String cliente=scanner.nextLine();

                    System.out.print("Total pagar: ");
                    double total=scanner.nextDouble();

                    System.out.print("Cancelado (true/false): ");
                    boolean cancelado=scanner.nextBoolean();

                    cola.agregarPedido(numero,cliente,total,cancelado);

                    break;

                case 2:
                    cola.mostrarPedidos();
                    break;

                case 3:
                    cola.procesarPedidos();
                    break;

                case 4:
                    System.out.println("Fin");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }while(op!=4);

        scanner.close();
    }
}
