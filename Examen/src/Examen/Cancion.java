package Examen;

public class Cancion {
    private String titulo;
    private int duracionMinutos;
    private int duracionSegundos;
    private String interpretes;
    private String compositor;

    public Cancion(String titulo, int duracionMinutos, int duracionSegundos, String interpretes, String compositor) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.interpretes = interpretes;
        this.compositor = compositor;
    }

    // Getters y Setters

    @Override
    public String toString() {
        return "Cancion [titulo=" + titulo + ", duracionMinutos=" + duracionMinutos + ", duracionSegundos=" +
                duracionSegundos + ", interpretes=" + interpretes + ", compositor=" + compositor + "]";
    }
}


