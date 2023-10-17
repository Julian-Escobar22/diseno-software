package Examen;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColeccionDeCanciones coleccion = new ColeccionDeCanciones();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar canción");
            System.out.println("2. Editar canción");
            System.out.println("3. Eliminar canción");
            System.out.println("4. Mostrar todas las canciones");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    
                    System.out.print("Título de la canción: ");
                    String titulo = scanner.nextLine();
                    System.out.print(" minutos de la cancion : ");
                    int duracionMinutos = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("segundos de la cancion : ");
                    int duracionSegundos = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Intérpretes: ");
                    String interpretes = scanner.nextLine();
                    System.out.print("Compositor: ");
                    String compositor = scanner.nextLine();

                    Cancion nuevaCancion = new Cancion(titulo, duracionMinutos, duracionSegundos, interpretes, compositor);
                    coleccion.agregarCancion(nuevaCancion);
                    break;

                case 2:
                    
                    List<Cancion> canciones = coleccion.obtenerTodasLasCanciones();
                    System.out.println("Lista de canciones:");

                    for (int i = 0; i < canciones.size(); i++) {
                        System.out.println(i + ". " + canciones.get(i));
                    }

                    System.out.print("Selecciona el índice de la canción a editar: ");
                    int indiceEditar = scanner.nextInt();
                    scanner.nextLine(); 

                    if (indiceEditar >= 0 && indiceEditar < canciones.size()) {
                        System.out.print("Nuevo título: ");
                        String nuevoTitulo = scanner.nextLine();
                        System.out.print("Nueva duración en minutos: ");
                        int nuevaDuracionMinutos = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Nueva duración en segundos: ");
                        int nuevaDuracionSegundos = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Nuevos intérpretes: ");
                        String nuevosInterpretes = scanner.nextLine();
                        System.out.print("Nuevo compositor: ");
                        String nuevoCompositor = scanner.nextLine();

                        Cancion cancionEditada = new Cancion(nuevoTitulo, nuevaDuracionMinutos, nuevaDuracionSegundos, nuevosInterpretes, nuevoCompositor);
                        coleccion.editarCancion(indiceEditar, cancionEditada);
                        System.out.println("Canción editada exitosamente.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 3:
                    
                    List<Cancion> cancionesEliminar = coleccion.obtenerTodasLasCanciones();
                    System.out.println("Lista de canciones:");

                    for (int i = 0; i < cancionesEliminar.size(); i++) {
                        System.out.println(i + ". " + cancionesEliminar.get(i));
                    }

                    System.out.print("Selecciona el numero para eliminar cancion : ");
                    int indiceEliminar = scanner.nextInt();
                    scanner.nextLine(); 

                    if (indiceEliminar >= 0 && indiceEliminar < cancionesEliminar.size()) {
                        coleccion.eliminarCancion(indiceEliminar);
                        System.out.println("Canción eliminada .");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 4:
                    
                    List<Cancion> todasLasCanciones = coleccion.obtenerTodasLasCanciones();
                    System.out.println("Todas las canciones en la colección:");

                    for (int i = 0; i < todasLasCanciones.size(); i++) {
                        System.out.println(i + ". " + todasLasCanciones.get(i));
                    }
                    break;

                case 5:
                    System.out.println("saliste del buscador de musica");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 5.");
            }
        }
    }
}
