package Examen;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDeCanciones {
    private List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void editarCancion(int indice, Cancion nuevaCancion) {
        if (indice >= 0 && indice < canciones.size()) {
            canciones.set(indice, nuevaCancion);
        }
    }

    public void eliminarCancion(int indice) {
        if (indice >= 0 && indice < canciones.size()) {
            canciones.remove(indice);
        }
    }

    public List<Cancion> obtenerTodasLasCanciones() {
        return canciones;
    }
}
