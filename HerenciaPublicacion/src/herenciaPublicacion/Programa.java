/**
 * 
 */
package herenciaPublicacion;
import java.util.Scanner;

/**
 * 
 */
public class Programa {

	/**
	 * 
	 */
	public Programa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Solicitar datos para un libro
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de Páginas: ");
        int numeroDePaginas = scanner.nextInt();
        System.out.print("Año de Publicación: ");
        int anoDePublicacion = scanner.nextInt();

        Libro libro = new Libro(tituloLibro, precioLibro, numeroDePaginas, anoDePublicacion);

        // Solicitar datos para un disco
        System.out.println("\nIngrese los datos del disco:");
        System.out.print("Título: ");
        scanner.nextLine(); // Limpiar el buffer del teclado
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: ");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración en Minutos: ");
        float duracionEnMinutos = scanner.nextFloat();

        Disco disco = new Disco(tituloDisco, precioDisco, duracionEnMinutos);

        // Mostrar los detalles de la publicación (libro y disco)
        System.out.println("\nDetalles del Libro:");
        libro.mostrar();

        System.out.println("\nDetalles del Disco:");
        disco.mostrar();
        
        scanner.close();
    }
}


