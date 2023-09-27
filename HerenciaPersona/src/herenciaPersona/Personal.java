package herenciaPersona;

public class Personal extends Persona {
	private String escuela;
	private double pago ;
	
	public Personal(String name, String direccion) {
		super(name,direccion);
	}

	public Personal() {
		// TODO Auto-generated constructor stub
	}
	
	public Personal(String name, String direccion,String escuela,double pago ) {
		super(name,direccion);
		this.escuela = escuela;
		this.pago = pago ;
	}
   
	public String getEscuela() {
		return escuela;
	}
	
	public void setEscuela(String escuela) {
		this.escuela = escuela ;
	}
	
	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago ;
	}
	@Override
	public String toString () {
		System.out.println("Personal:");
		return super.toString() + "de la escuela : " + escuela + " tiene un pago de : " + pago  ;
		
	}
	
	
	
}