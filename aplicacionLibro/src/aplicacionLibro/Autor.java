package aplicacionLibro;

public class Autor {
	private String name; 
	private String email; 
	private char genero; 
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	public Autor( String name, String email, char genero) {
		this.name = name; 
		this.email= email; 
		this.genero = genero; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getEmail() {
		
		return email; 
	}
	
	public void setEmail(String email) {
		this.email = email; 
	}
	
	public char getGenero() {
		return genero; 
	}
	
	public String toString() {
		return "Autor de nombre: " + name + " con email de: " + email + " y genero: " + genero;  
	}
}
