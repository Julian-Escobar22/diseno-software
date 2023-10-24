/**
 * 
 */
package bloc7;

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
		Estudiante estudiante = new Estudiante("Juan", "Perez", "12345", "Soltero", "Ing. Informática");
        Profesor profesor = new Profesor("Ana", "López", "67890", "Casado", 2010, 205, "Matemáticas");
        PersonalServicio personalServicio = new PersonalServicio("Carlos", "González", "54321", "Viudo", 2015, 103, "Biblioteca");

        // Pruebas de métodos
        estudiante.matricular("Ing. Software");
        profesor.cambiarDepartamento("Lenguajes");
        personalServicio.cambiarSeccion("Decanato");

        // Imprimir información
        estudiante.imprimirInformacion();
        System.out.println("-----------------------");
        profesor.imprimirInformacion();
        System.out.println("-----------------------");
        personalServicio.imprimirInformacion();
    }
	}


