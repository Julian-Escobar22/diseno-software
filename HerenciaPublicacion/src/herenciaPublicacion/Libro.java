package herenciaPublicacion;

class Libro extends Publicacion {
    private int numeroDePaginas;
    private int anoDePublicacion;

    public Libro(String titulo, float precio, int numeroDePaginas, int anoDePublicacion) {
        super(titulo, precio);
        this.numeroDePaginas = numeroDePaginas;
        this.anoDePublicacion = anoDePublicacion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de Páginas: " + numeroDePaginas);
        System.out.println("Año de Publicación: " + anoDePublicacion);
    }
}