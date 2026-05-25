import java.util.Scanner;

public class App {
   public static void menu(){
        System.out.println("\nPeaje Inteligente");
        System.out.println("1. Registrar vehiculo");
        System.out.println("2. Mostrar cola");
        System.out.println("3. Cerrar turno");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        Cpeaje cola=new Cpeaje();

        int op;

        do{
            menu();
            op=scanner.nextInt();
            scanner.nextLine();

            switch(op){

                case 1:

                    System.out.print("Placa: ");
                    String placa=scanner.nextLine();

                    System.out.print("Tipo: ");
                    String tipo=scanner.nextLine();

                    System.out.print("Tarifa: ");
                    double tarifa=scanner.nextDouble();

                    System.out.print("Exento (true/false): ");
                    boolean exento=scanner.nextBoolean();

                    cola.ingresarVehiculo(
                        placa,tipo,tarifa,exento);

                    break;

                case 2:
                    cola.mostrarVehiculos();
                    break;

                case 3:
                    cola.cerrarTurno();
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
