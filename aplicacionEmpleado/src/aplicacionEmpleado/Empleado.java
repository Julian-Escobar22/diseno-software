package aplicacionEmpleado;

public class Empleado {
	private int id ; 
    private String firstName ;
    private String lastName;
    private int salario; 

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(int id, String firstName, String lastName,int salario ) {
		this.id = id ; 
		this.firstName = firstName;
		this.lastName =  lastName; 
		this.salario = salario; 
		
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstname(){
		return firstName ;
	}
	
	public String getLastname() {
		return lastName;
	}
	
    public String getName() {
    	String myname = firstName + lastName;  
    	return myname ; 
    }
    
    public double getSalario(){
    	return salario;
    }
    
    public void setSalario(int salario ) {
    	this.salario = salario;
    }
    
    public double getsalarioanual() {
    	int salarioA = this.salario * 12;
    	return salarioA;
    }
    
    public int raiseSalario() {
    	int salarioI = this.salario * 30/100 ;
    	return salarioI;
    }
    
    @Override
    public String toString () {
    	return "Empleado registrado con id : " + id + " con primer nombre:" + firstName + " y segundo nombre: " + lastName + " obtuvo un salario de:" + salario;
    			
    }
}
