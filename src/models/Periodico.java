package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Periodico extends MaterialBiblioteca{

    private String fecha;

    public Periodico(String titulo, String autor, int anioPublicacion, String fecha) {
        super(titulo, autor, anioPublicacion);
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String mostrarClase() {
        return "Periodico{" +
                "fecha='" + fecha + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';    }

}
