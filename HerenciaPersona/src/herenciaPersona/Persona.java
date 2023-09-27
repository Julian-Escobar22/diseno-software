package herenciaPersona;

public class Persona {

	private String name; 
	private String direccion;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
public  Persona(String name, String direccion) {
	this.name = name; 
	this.direccion = direccion;
}

public String getName() {
    return name ; 
}

public String getDireccion () {
	return direccion ;
}

public void setDireccion (String direccion) {
	this.direccion = direccion ;
}
 

public String toString () {
	return " nombre : " + name +  " Con direccion : " + direccion ;
}

}