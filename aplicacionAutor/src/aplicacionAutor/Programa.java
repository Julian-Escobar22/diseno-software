/**
 * 
 */
package aplicacionAutor;

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
		Cuenta cuenta1 = new Cuenta("Bancolombia", "Julian Escobar", 1000);
		Cuenta cuenta2 = new Cuenta( "Davivienda"," Santiago Escobar",2000); 
	    System.out.println(cuenta1);
		System.out.println(cuenta2); 
		
		//
		
		cuenta1.credit(200); 
		cuenta2.debit(300); 
		cuenta1.transferTo(cuenta2, 300);
		//
		System.out.println(" La cuenta despues de las transacciones tiene un estado de:" + cuenta1); 
		System.out.println("La cuenta despues de las transacciones tiene un esatado de:" + cuenta2 ); 
	}
}


