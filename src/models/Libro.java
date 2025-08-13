package models;

public class Libro extends MaterialBiblioteca implements Prestable{

    private String genero;
    private int numeroPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion, String genero, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas>0) this.numeroPaginas = numeroPaginas;
        else throw new RuntimeException("No puede ingresar un numero de pagina Negativo o igual a 0");
    }

    @Override
    public String mostrarClase() {
        return "Libro{" +
                "Género='" + genero + '\'' +
                ", Número de Paginas=" + numeroPaginas +
                ", Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Año de publicación=" + anioPublicacion +
                '}';
    }

    @Override
    public void prestar() {
        if(prestado){
            System.out.println("El libro "+this.titulo+" ya se ha prestado.");
        }else{
            prestado = true;
            System.out.println("Libro prestado: "+this.titulo);
        }

    }

    @Override
    public String toString() {
        return mostrarClase();
    }

    @Override
    public void devolver() {
        if(prestado){
            prestado = false;
            System.out.println("El libro "+this.titulo+" se ha devuelto.");
        }else {
            System.out.println("El Libro no estaba prestado: "+this.titulo);
        }

    }
}
