package coleccionVinilos.modelo;

public class Coleccion {
    private Vinilo[] listaVinilos;
    private int cantidadActual;
    private static final int MAX_COLECCION = 100;

    public Coleccion() {
        this.listaVinilos = new Vinilo[MAX_COLECCION];
        this.cantidadActual = 0;
    }

    public void agregarVinilo(Vinilo vinilo) {
        if (this.cantidadActual < MAX_COLECCION) {
            this.listaVinilos[this.cantidadActual] = vinilo;
            this.cantidadActual++;
        } else {
            System.out.println("Error: la coleccion esta llena");
        }
    }

    public int getTotalVinilos() {
        return this.cantidadActual;
    }

    public int getEspaciosDisponibles() {
        return MAX_COLECCION - this.cantidadActual;
    }

    public boolean buscarArtista(String artista) {
        for (int i = 0; i < this.cantidadActual; i++) {
            if (this.listaVinilos[i].getArtista().equalsIgnoreCase(artista)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarColeccionCompleto() {
        for (int i = 0; i < this.cantidadActual; i++) {
            System.out.println("Fila " + (i+1) + ": " + this.listaVinilos[i]);
        }
    }

    public int getMaximoEspacio() {
        return MAX_COLECCION;
    }
}

