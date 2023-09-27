package herenciaCirculo;

public class Circulo  {
	private double radius = 1.0;
    private String color;

    
	
	public Circulo() {
		
	//constructor hub
		
	}
	public Circulo(double radius) {
		this.radius = 1.0;
		this.color = color;
	}
	public Circulo(double radius, String color) {
		this.color= color;
		this.radius= 1.0;    
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=1.0;
	}
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	 public double getArea() {
	        return Math.PI * Math.pow(radius, 2);
	    }
	
	@Override
	public String toString() {
		return "Circulo de radio: " + radius + " color " + color;
	}



}