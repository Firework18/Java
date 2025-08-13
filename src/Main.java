import models.Libro;
import models.MaterialBiblioteca;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventario<Libro> inventarioLibros = new Inventario<>();
        inventarioLibros.add(new Libro("La ciudad y los perros","Mario Vargas Llosa",1995,"Drama",1000));
        inventarioLibros.add(new Libro("La ciudad y los perros2","Mario Vargas Llosa2",1996,"Drama2",1001));
        inventarioLibros.add(new Libro("La ciudad y los perros3","Mario Vargas Llosa3",1997,"Drama3",1002));

        List<Libro> libros = inventarioLibros.listar();
        libros.forEach(System.out::println);
    }
}
