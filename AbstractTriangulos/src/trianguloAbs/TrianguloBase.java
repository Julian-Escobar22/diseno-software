package trianguloAbs;

public abstract class TrianguloBase {
    public abstract double Perimetro();

    public double CalcularAreaConHipotenusa(int lado, int hipotenusa) {
        double cateto1 = Math.sqrt(hipotenusa * hipotenusa - lado * lado);
        double area = (lado * cateto1) / 2;
        return area;
    }
}