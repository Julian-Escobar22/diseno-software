package aplicacionCirculo;

public class Circulo {

	private double radio;
	
	public Circulo() {
		// TODO Auto-generated constructor stub	
		radio = 1.0;
		
	}

	public Circulo(double radio) {
		this.radio = radio ;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public  double getArea() {
		double miArea=Math.PI * Math.pow( this.radio,2);
		return miArea;
	}
	public double getCircunferencia() {
		double Circunferencia= 2*this.radio;
		return Circunferencia;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
}
