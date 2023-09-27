package herenciaPersona;

public class Studiante extends Persona {
	
	private String programa; 
	private int año;
	private double tarifa;
	
	
	
	public Studiante() {
		// TODO Auto-generated constructor stub
	}

	public Studiante(String name, String direccion,String programa,int año,double tarifa ) {
	    super(name,direccion);
		this.programa = programa;
		this.año = año;
		this.tarifa = tarifa;
	}
	
	public String getPrograma() {
		return programa;
	}
	
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
	public double getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public String toString () {
		return super.toString() + "del programa : " + programa + " del año: " + año + " Tiene una tarifa de : " + tarifa;
		
	}
	
}