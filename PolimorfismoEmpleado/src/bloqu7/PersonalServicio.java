package bloqu7;

class PersonalServicio extends Empleado {
    protected String areaTrabajo;

    public PersonalServicio(String nombre, String apellidos, int numeroIdentificacion, String estadoCivil,
                            int anoIncorporacion, int numeroDespacho, String areaTrabajo) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
        this.areaTrabajo = areaTrabajo;
    }

    public void cambiarAreaTrabajo(String nuevaAreaTrabajo) {
        this.areaTrabajo = nuevaAreaTrabajo;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Área de Trabajo: " + areaTrabajo);
    }
}
