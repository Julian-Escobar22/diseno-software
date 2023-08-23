/**
 * 
 */
package ejercicioGatoPkg;

/**
 * 
 */
public class EjercicioGato {

	/**
	 * 
	 */
	public EjercicioGato() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato miGato=new Gato();
		miGato.setNombre("jeferson");
		miGato.maullar();
		miGato.dormir(2);
		miGato.comida(" atun");
		miGato.correr(" mi casa");
		
		System.out.println("El nombre de mi gato es "+miGato.getNombre());

	}

}
