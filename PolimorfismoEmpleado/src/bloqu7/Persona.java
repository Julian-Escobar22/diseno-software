package bloqu7;

class Persona {
    protected String nombre;
    protected String apellidos;
    protected int numeroIdentificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, int numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de Identificación: " + numeroIdentificacion);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}