public class Cpeaje {

     private Vehiculo frente;
    private Vehiculo fin;

    public Cpeaje() {

        frente = null;
        fin = null;
    }

    // ENQUEUE
    public void ingresarVehiculo(String placa,String tipo,double tarifa, boolean exento) {

        Vehiculo nuevo =
            new Vehiculo(placa,tipo,tarifa,exento);

        if (frente == null) {

            frente = nuevo;
            fin = nuevo;

        } else {

            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nVehiculo agregado.");
    }

  
    public Vehiculo cobrarVehiculo() {

        if (frente == null) {
            return null;
        }

        Vehiculo aux = frente;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return aux;
    }

    public void mostrarVehiculos() {

        if (frente == null) {

            System.out.println("\nNo hay vehiculos.");
            return;
        }

        Vehiculo aux = frente;

        System.out.println("\nCola de peaje");

        while (aux != null) {

            System.out.println(
                "-----");

            System.out.println("Placa: " + aux.placa);

            System.out.println("Tipo: " + aux.tipoVehiculo);

            System.out.println( "Tarifa: " + aux.tarifa);

            System.out.println("Exento: " + aux.esExento);

            aux = aux.siguiente;
        }
    }

    
    public void cerrarTurno() {

        double total = 0;

        if (frente == null) {

            System.out.println( "\nNo hay vehiculos.");
            return;
        }

        System.out.println("\nCierre de turno");

        while (frente != null) {

            Vehiculo v = cobrarVehiculo();

            System.out.println("\nVehiculo procesado");

            System.out.println("Placa: " + v.placa);

            System.out.println( "Tipo: " + v.tipoVehiculo);

            if (!v.esExento) {

                total += v.tarifa;
            }
        }

        System.out.println("\nTotal recaudado: $" + total);
    }

}
