package trianguloAbs;

public class Escaleno extends TrianguloBase {
    private int lado1;
    private int lado2;
    private int lado3;

    public Escaleno(int l1, int l2, int l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    @Override
    public double Perimetro() {
        return lado1 + lado2 + lado3;
    }
}