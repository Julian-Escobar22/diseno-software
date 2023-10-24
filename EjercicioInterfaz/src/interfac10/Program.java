/**
 * 
 */
package interfac10;

/**
 * 
 */
public class Program {

	/**
	 * 
	 */
	public Program() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Revista revista = new Revista("R001", "Java Magazine", 2022, 15);
        System.out.println(revista);

        // Crear un Libro
        Libro libro = new Libro("R001", "Programación en Java", 2022);
        System.out.println(libro);

        // Prestar y devolver un libro
        libro.prestar();
        System.out.println("¿Libro prestado? " + libro.prestado());

        libro.devolver();
        System.out.println("¿Libro prestado? " + libro.prestado());
    }
	}


