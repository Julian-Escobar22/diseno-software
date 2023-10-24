package bloc7;

class Empleado extends Persona {
    private int añoIncorporacion;
    private int numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                    int añoIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(int nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Año de Incorporación: " + añoIncorporacion);
        System.out.println("Número de Despacho: " + numeroDespacho);
    }
}