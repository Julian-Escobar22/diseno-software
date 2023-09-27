/**
 * 
 */
package herenciaAnimal;

/**
 * 
 */
public class PPrograma {

	/**
	 * 
	 */
	public PPrograma() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHerencia animal = new AnimalHerencia("Fuki");
        System.out.println(animal);

        Mamma1 mammal = new Mamma1("");
        System.out.println(mammal.toString() + animal.name);

        Cat gato = new Cat("");
        System.out.println(gato.toString() + animal.name);
        gato.greets();

        Dog perro = new Dog("");
        System.out.println(perro.toString() + animal.name);
        perro.greets();
        perro.greets(perro);
    }

}


