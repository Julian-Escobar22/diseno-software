package bloc7;

class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
                            int añoIncorporacion, int numeroDespacho, String seccion) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, añoIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección: " + seccion);
    }
}