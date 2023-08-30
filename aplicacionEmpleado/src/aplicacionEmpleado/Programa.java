/**
 * 
 */
package aplicacionEmpleado;
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
		Empleado empleado1 = new Empleado(98,"julian","Escobar,",0);
	     Scanner teclado = new Scanner(System.in);
	     System.out.println("ingrese el salario");
	     empleado1.setSalario(teclado.nextInt ());
	     System.out.println(empleado1);
	     
		
	     System.out.println("El sueldo anual de:" + empleado1.getName()+ ":" + empleado1.getsalarioanual());
	     System.out.println("El  incremento de 30% es de:" + empleado1.raiseSalario());
	     double salarioConIncremento = empleado1.getSalario() + empleado1.raiseSalario();
	     System.out.println("El salario final con el incremento de 30% es de: " + salarioConIncremento);
	    
		}
	}


