package coleccionVinilos.modelo;

public class Vinilo {
    private String artista;
    private String album;
    private String año;

    public Vinilo(String artista, String album, String año) {
        this.artista = artista;
        this.album = album;
        this.año = año;
    }

    public String getArtista() {
        return this.artista;
    }

    @Override
    public String toString() {
        return this.artista + " - " + this.album + " - " + this.año;
    }
}
