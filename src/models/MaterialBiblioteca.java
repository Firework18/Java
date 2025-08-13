package models;

public abstract class MaterialBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion>0) this.anioPublicacion = anioPublicacion;
        else throw new RuntimeException("No puede ingresar un año negativo o igual a 0");
    }

    public abstract String mostrarClase();


}
