/**
 * 
 */
package herenciaCirculo;

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
		Circulo circulo1 = new Circulo(0,"Rojo"); 
        System.out.println("Circulo 1: " + circulo1);
        System.out.println("Área del Circulo 1: " + circulo1.getArea());

        Circulo circulo2 = new Circulo(0,"Rosado"); 
        System.out.println("Circulo 2: " + circulo2.toString());
        System.out.println("Área del Circulo 2: " + circulo2.getArea());

        Circulo circulo3 = new Circulo(0, "amarillo"); 
        System.out.println("Circulo 3: " + circulo3.toString());
        System.out.println("Área del Circulo 3: " + circulo3.getArea());

        Cilindro cilindro1 = new Cilindro(circulo1.getRadius(), 0, circulo1.getColor()); 
        System.out.println("Cilindro 1: " + cilindro1);
        System.out.println("Volumen del Cilindro 1: " + cilindro1.getVolumen());
       

        Cilindro cilindro2 = new Cilindro(circulo2.getRadius(),0,circulo2.getColor()); 
        System.out.println("Cilindro 2: " + cilindro2);
        System.out.println("Volumen del Cilindro 2: " + cilindro2.getVolumen());

        Cilindro cilindro3 = new Cilindro(circulo3.getRadius(), 0,circulo3.getColor()); 
        System.out.println("Cilindro 3: " + cilindro3);
        System.out.println("Volumen del Cilindro 3: " + cilindro3.getVolumen());
    }
}


