/**
 * 
 */
package aplicacionCuenta;
import java.util.Scanner;
/**
 * 
 */
public class CuentaApp {

	/**
	 * 
	 */
	public CuentaApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cuenta cuenta_1 = new Cuenta("Julian Escobar");
	        Cuenta cuenta_2 = new Cuenta("Santiago Escobar");
	        
	        //Ingresa dinero en las cuentas
	        
	        
	        Scanner teclado = new Scanner(System.in);
	        System.out.println("ingrese la cantidad a depositar o ingresar para la cuenta 1");
	        cuenta_1.setCantidad(teclado.nextDouble());
	        Scanner teclado1 = new Scanner(System.in);
	        System.out.println("ingrese la cantidad a depositar o ingresar para la cuenta 2");
	        cuenta_2.setCantidad(teclado.nextDouble());
	         
	        //Retiramos dinero en las cuentas
	        Scanner teclado3 = new Scanner(System.in);
	        System.out.println("ingrese la cantidad a retiar de la cuenta 1");
	        cuenta_1.retirar(teclado.nextDouble());
	        Scanner teclado4 = new Scanner(System.in);
	        System.out.println("ingrese la cantidad a retirar de la cuenta 2");
	        cuenta_2.retirar(teclado.nextDouble());
	        
	     
	        //Muestro la informacion de las cuentas
	        System.out.println(cuenta_1);
	        System.out.println(cuenta_2); 
	         
	    }
	}


