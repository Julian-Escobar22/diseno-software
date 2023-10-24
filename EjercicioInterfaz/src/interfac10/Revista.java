package interfac10;

public class Revista extends Publicacion {
	
	private int numero; 
	
	
	public Revista(String codigo, String titulo, int anio, int numero) {
		// TODO Auto-generated constructor stub
		super(codigo, titulo, anio);
		this.numero = numero;
	}

	@Override
	public String toString() {
	return super.toString()	+ " Numero :" + numero; 
	}
	
}