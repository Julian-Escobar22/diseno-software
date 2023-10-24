package bloc7;

class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                   int añoIncorporacion, int numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, añoIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Departamento: " + departamento);
    }
}