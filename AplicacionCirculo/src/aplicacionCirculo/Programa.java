/**
 * Esta es la aplicacion para circulos 
 */
package aplicacionCirculo;
import java.util.Scanner;
/**
 * este es la clase '
 */
public class Programa {

	/**
	 * este es el ' constructor de la clase 
	 */
	public Programa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circulo miCirculo=new Circulo();
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        miCirculo.setRadio(teclado.nextDouble());
        System.out.println(miCirculo.getArea());
        System.out.println(miCirculo);
	}

}
