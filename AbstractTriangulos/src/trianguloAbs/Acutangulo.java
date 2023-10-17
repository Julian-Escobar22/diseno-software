package trianguloAbs;

public class Acutangulo extends TrianguloBase {
    private int lado1;
    private int lado2;
    private int hipotenusa;

    public Acutangulo(int l1, int l2, int hip) {
        lado1 = l1;
        lado2 = l2;
        hipotenusa = hip;
    }

    @Override
    public double Perimetro() {
        return lado1 + lado2 + hipotenusa;
    }
}