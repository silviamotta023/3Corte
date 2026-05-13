package Ejercicio_2;

public class Pila {

    private Pieza tope;

    // Constructor
    public Pila() {
        tope = null;
    }

    // Método push
    public void push(String nombrePieza, String numeroSerie, boolean esDefectuosa) {

        Pieza nueva = new Pieza(nombrePieza, numeroSerie, esDefectuosa);

        nueva.siguiente = tope;
        tope = nueva;

        System.out.println("Pieza agregada correctamente");
    }


    public Pieza pop() {

        if (tope == null) {
            return null;
        }

        Pieza aux = tope;
        tope = tope.siguiente;

        return aux;
    }


    public void mostrarPila() {

        if (tope == null) {
            System.out.println("La pila está vacía");
            return;
        }

        Pieza aux = tope;

        System.out.println("\nPieza en la pila");

        while (aux != null) {

            System.out.println("Nombre: " + aux.nombrePieza);
            System.out.println("Serie: " + aux.numeroSerie);
            System.out.println("Defectuosa: " + aux.esDefectuosa);
            System.out.println("---");

            aux = aux.siguiente;
        }
    }


    public void limpiarHastaDefecto() {

        if (tope == null) {
            System.out.println("La pila está vacía");
            return;
        }

        boolean encontrada = false;

        System.out.println("\nPiezas buenas retiradas:");

        while (tope != null) {

            Pieza actual = pop();

            if (actual.esDefectuosa) {

                System.out.println("\nPieza defectuosa encontrada");
                System.out.println("Nombre: " + actual.nombrePieza);
                System.out.println("Serie: " + actual.numeroSerie);

                encontrada = true;
                break;
            }

            System.out.println("- " + actual.nombrePieza);
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna pieza defectuosa");
        }
    }
}
