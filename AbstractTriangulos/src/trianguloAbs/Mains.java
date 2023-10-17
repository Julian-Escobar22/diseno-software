/**
 * 
 */
package trianguloAbs;

/**
 * 
 */
public class Mains {

	/**
	 * 
	 */
	public Mains() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Escaleno escaleno = new Escaleno(3, 4, 5);
	        Acutangulo acutangulo = new Acutangulo(5, 12, 13);

	        double areaEscaleno = escaleno.CalcularAreaConHipotenusa(3, 5);
	        double perimetroEscaleno = escaleno.Perimetro();

	        double areaAcutangulo = acutangulo.CalcularAreaConHipotenusa(5, 13);
	        double perimetroAcutangulo = acutangulo.Perimetro();

	        System.out.println("Área del triángulo escaleno: " + areaEscaleno);
	        System.out.println("Perímetro del triángulo escaleno: " + perimetroEscaleno);

	        System.out.println("Área del triángulo acutángulo: " + areaAcutangulo);
	        System.out.println("Perímetro del triángulo acutángulo: " + perimetroAcutangulo);
	    }
	}


