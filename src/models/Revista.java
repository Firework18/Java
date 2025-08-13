package models;

public class Revista extends MaterialBiblioteca implements Prestable{

    private String edicion,mesPublicacion;

    public Revista(String titulo, String autor, int anioPublicacion, String edicion, String mesPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.edicion = edicion;
        this.mesPublicacion = mesPublicacion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String mostrarClase() {
        return "Revista{" +
                "edicion='" + edicion + '\'' +
                ", mesPublicacion='" + mesPublicacion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';    }

    @Override
    public void prestar() {
        System.out.println("La revista "+titulo+" se ha prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("La revista "+titulo+" se ha devuelto.");
    }
}
