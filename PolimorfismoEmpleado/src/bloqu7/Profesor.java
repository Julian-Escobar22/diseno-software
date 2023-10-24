package bloqu7;

class Profesor extends Empleado {
    protected String departamento;

    public Profesor(String nombre, String apellidos, int numeroIdentificacion, String estadoCivil,
                    int anoIncorporacion, int numeroDespacho, String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
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