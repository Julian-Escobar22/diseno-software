/**
 * 
 */
package aplicacionFabrica;

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
		PlantaFabricacion planta1 = new PlantaFabricacion();
        PlantaFabricacion planta2 = new PlantaFabricacion();

        planta1.fabricarCarros(100, 1); // Fabricar 100 carros en la planta 1
        planta2.fabricarCarros(100, 2); // Fabricar 100 carros en la planta 2
    }

	}


