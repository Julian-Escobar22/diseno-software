package bloqu7;

class Estudiante extends Persona {
    protected String cursoMatriculado;

    public Estudiante(String nombre, String apellidos, int numeroIdentificacion, String estadoCivil,
                      String cursoMatriculado) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public void matricularEnCurso(String nuevoCurso) {
        this.cursoMatriculado = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso Matriculado: " + cursoMatriculado);
    }
}

