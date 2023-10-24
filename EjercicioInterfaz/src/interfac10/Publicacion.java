package interfac10;

public class Publicacion {

	private String codigo; 
	private int anio;
	private String titulo;
	
	public Publicacion(String codigo, String titulo, int anio) {
		// TODO Auto-generated constructor stub
		this.anio = anio; 
		this.codigo = codigo;
		this.titulo = titulo;
	}
	
	
	
	
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}


	@Override
	public String toString() {
		return "publicacion con codigo : " + codigo + " y titulo: " + titulo + " con año de publiacion: " + anio ;
	
	}

}