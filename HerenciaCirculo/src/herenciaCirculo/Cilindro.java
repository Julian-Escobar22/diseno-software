package herenciaCirculo;

public class Cilindro extends Circulo {
	private double height= 1.0;

	public Cilindro() {
		//constructor hub		
	    }

	    public Cilindro(double radius) {
	        super(radius);
	        
	    }

	    public Cilindro(double radius, double height) {
	        super(radius);
	        this.height = 1.0;
	    }

	   
	public Cilindro(double radius, double height, String color) {
	        super(radius, color);
	        this.height = 1.0;
	    }

	    public double getHeight() {
	        return height;
	    }
	    
	    public void setHeight(double height) {
	    	this.height = 1.0;
	    }

		public double getVolumen() {
			
			double volumen = Math.PI * Math.pow(getRadius(), 2) * height;
			return volumen;
		}
	    
}