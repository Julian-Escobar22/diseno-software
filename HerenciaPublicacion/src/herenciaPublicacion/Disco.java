package herenciaPublicacion;

class Disco extends Publicacion {
    private float duracionEnMinutos;

    public Disco(String titulo, float precio, float duracionEnMinutos) {
        super(titulo, precio);
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Duración en Minutos: " + duracionEnMinutos);
    }
}