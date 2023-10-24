package bloqu7;

class Empleado extends Persona {
    protected int anoIncorporacion;
    protected int numeroDespacho;

    public Empleado(String nombre, String apellidos, int numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(int nuevoNumeroDespacho) {
        this.numeroDespacho = nuevoNumeroDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Año de Incorporación: " + anoIncorporacion);
        System.out.println("Número de Despacho: " + numeroDespacho);
    }
}
