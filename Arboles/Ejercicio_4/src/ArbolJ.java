public class ArbolJ {

    Jugador raiz;

   
    public void insertar(int elo, String nombre, String pais, int partidas) {

        raiz = insertarRec(raiz, elo, nombre, pais, partidas);
    }

    private Jugador insertarRec(Jugador nodo, int elo, String nombre, String pais, int partidas) {

       
        if (nodo == null) {
            return new Jugador(elo, nombre, pais, partidas);
        }

        
        if (elo < nodo.elo) {
            nodo.izquierda = insertarRec(nodo.izquierda, elo, nombre, pais, partidas);
        }

     
        else if (elo > nodo.elo) {
            nodo.derecha = insertarRec(nodo.derecha, elo, nombre, pais, partidas);
        }

        return nodo;
    }

    public void listarEnRango(int eloMin, int eloMax) {

        System.out.println("\nJugadores en el rango");
        listarEnRangoRec(raiz, eloMin, eloMax);
    }

    private void listarEnRangoRec(Jugador nodo, int eloMin, int eloMax) {

       
        if (nodo == null) {
            return;
        }

       
        if (nodo.elo > eloMin) {
            listarEnRangoRec(nodo.izquierda, eloMin, eloMax);
        }

     
        if (nodo.elo >= eloMin && nodo.elo <= eloMax) {

            System.out.println("ELO: " + nodo.elo +" | Usuario: " + nodo.nombreUsuario + " | Pais: " + nodo.pais + " | Partidas: " + nodo.partidasJugadas
            );
        }

        if (nodo.elo < eloMax) {
            listarEnRangoRec(nodo.derecha, eloMin, eloMax);
        }
    }

}
