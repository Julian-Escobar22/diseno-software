/**
 * 
 */
package herenciaPersona;
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
		 Persona persona1 = new Persona("Carlos", "");
		    Scanner teclado = new Scanner(System.in);
		    System.out.println("Ingrese la dirección");
		    persona1.setDireccion(teclado.nextLine());
		    System.out.println("Datos registrados: " + persona1);

		    Studiante estudiante = new Studiante(persona1.getName(), persona1.getDireccion(), "", 0, 0);
		    Scanner teclado2 = new Scanner(System.in);
		    System.out.println("Ingrese el programa");
		    estudiante.setPrograma(teclado2.nextLine());
		    System.out.println("Ingrese el Año");
		    estudiante.setAño(teclado2.nextInt());
		    teclado2.nextLine();
		    System.out.println("Ingrese la tarifa");
		    estudiante.setTarifa(teclado2.nextDouble());
		    System.out.println("Estudiante Con datos registrados: " + estudiante);
		    
		    Personal empleado = new Personal(persona1.getName(), persona1.getDireccion(), "", 0);
		    Scanner teclado3 = new Scanner(System.in);
		    System.out.println("Ingrese La escuela");
		    empleado.setEscuela(teclado3.nextLine());
		    System.out.println("Ingrese Salarario");
		    empleado.setPago(teclado2.nextDouble());
		    System.out.println("Trabajador Con datos registrados: " + empleado);
		    
		    
		    
		    
		    
		    
		}
}


