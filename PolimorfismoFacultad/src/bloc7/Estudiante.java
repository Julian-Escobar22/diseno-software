package bloc7;

class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public void matricular(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso Matriculado: " + curso);
    }
}