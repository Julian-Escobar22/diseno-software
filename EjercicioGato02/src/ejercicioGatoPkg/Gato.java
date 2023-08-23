package ejercicioGatoPkg;

public class Gato {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	private String nombre;
	private String genero;
	private int edad;
	private String color;
	private float peso;
	
	
	public Gato() {
		
	}
	
	public void respirar() {
		System.out.println("Estoy respirando.");
	}
	public void comida(String comida) {
		System.out.println("Estoy comiendo" + comida);
	}
	public void correr(String correr) {
		System.out.println("Estoy corriendo hacia " + correr );
	}
	public void dormir(int dormir) {
		System.out.println("Estoy durmiendo por " + dormir + " horas ");
	}
	public void maullar() {
		System.out.println("Meow");
	}
}

