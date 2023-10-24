/**
 * 
 */
package bloqu7;

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
		Persona persona = new Persona("Juan", "Perez", 123456, "Soltero");
        Empleado empleado = new Empleado("Maria", "Gomez", 789012, "Casado", 2010, 101);
        Estudiante estudiante = new Estudiante("Carlos", "Lopez", 345678, "Soltero", "Ing. Informática");
        Profesor profesor = new Profesor("Ana", "Martinez", 901234, "Viudo", 2005, 201, "Matemáticas");
        PersonalServicio personalServicio = new PersonalServicio("Pedro", "Rodriguez", 567890, "Soltero", 2012, 301, "Biblioteca");

        // Realizar acciones
        persona.cambiarEstadoCivil("Casado");
        empleado.reasignarDespacho(102);
        estudiante.matricularEnCurso("Ing. Electrónica");
        profesor.cambiarDepartamento("Física");
       
        // Imprimir información
        persona.imprimirInformacion();
        System.out.println("-----------");
        empleado.imprimirInformacion();
        System.out.println("-----------");
        estudiante.imprimirInformacion();
        System.out.println("-----------");
        profesor.imprimirInformacion();
        System.out.println("-----------");
        personalServicio.imprimirInformacion();

        // Acciones adicionales
        persona.cambiarEstadoCivil("Divorciado");
        personalServicio.cambiarAreaTrabajo("Secretaría");
        profesor.cambiarDepartamento("Historia");

        // Imprimir información actualizada
        System.out.println("-----------");
        persona.imprimirInformacion();
        System.out.println("-----------");
        empleado.imprimirInformacion();
        System.out.println("-----------");
        estudiante.imprimirInformacion();
        System.out.println("-----------");
        profesor.imprimirInformacion();
        System.out.println("-----------");
        personalServicio.imprimirInformacion();
    }
}
	


