package herenciaAnimal;

public class AnimalHerencia {

	 protected String name;
	 public AnimalHerencia() {

	}
   
	public AnimalHerencia(String name) {
		this.name=name;
		
	}
	public String toString() {
		return "Animal(name=" + name + ")";
	}
}
