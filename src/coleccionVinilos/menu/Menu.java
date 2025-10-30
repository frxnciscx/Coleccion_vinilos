package coleccionVinilos.menu;

import coleccionVinilos.modelo.Vinilo;
import coleccionVinilos.modelo.Coleccion;

public class Menu {
    public static void main(String[] args) {
        Coleccion miColeccion = new Coleccion();
        System.out.println("Espacio maximo coleccion: " + miColeccion.getMaximoEspacio());

        miColeccion.agregarVinilo(new Vinilo("Iron Maiden", "Iron Maiden", "1980"));
        miColeccion.agregarVinilo(new Vinilo("Iron Maiden", "Killers", "1981"));
        miColeccion.agregarVinilo(new Vinilo("Iron Maiden", "The number of the beast", "1982"));
        miColeccion.agregarVinilo(new Vinilo("AC-DC", "Back in black", "1980"));
        miColeccion.agregarVinilo(new Vinilo("AC-DC", "Highway to Hell", "1979"));
        miColeccion.agregarVinilo(new Vinilo("AC-DC", "Who made who", "1986"));
        miColeccion.agregarVinilo(new Vinilo("Judas Priest", "British steel", "1980"));
        miColeccion.agregarVinilo(new Vinilo("Judas Priest", "Painkiller", "1990"));
        miColeccion.agregarVinilo(new Vinilo("Judas Priest", "Defenders of the faith", "1984"));
        miColeccion.agregarVinilo(new Vinilo("Kiss", "Destroyer", "1976"));

        System.out.println("Hay un total de: " + miColeccion.getTotalVinilos() + " vinilos en la coleccion");
        System.out.println("Hay un total de: " + miColeccion.getEspaciosDisponibles() + " espacios disponibles en la coleccion");
        System.out.println();

        String artistaBuscado = "AC-DC";
        System.out.println("Buscar artista: " + artistaBuscado);

        if (miColeccion.buscarArtista(artistaBuscado)) {
            System.out.println("El artista " + artistaBuscado + " si esta en la coleccion");
        } else {
            System.out.println("El artista " + artistaBuscado + " no esta en la coleccion");
        }
        System.out.println();

        miColeccion.mostrarColeccionCompleta();
    }
}
