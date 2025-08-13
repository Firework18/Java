import models.Libro;
import models.MaterialBiblioteca;
import models.Periodico;
import models.Revista;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventario<Libro> inventarioLibros = new Inventario<>();
        inventarioLibros.add(new Libro("La ciudad y los perros","Mario Vargas Llosa",1995,"Drama",1000));
        inventarioLibros.add(new Libro("La ciudad y los perros2","Mario Vargas Llosa2",1996,"Drama2",1001));
        inventarioLibros.add(new Libro("La ciudad y los perros3","Mario Vargas Llosa3",1997,"Drama3",1002));

        System.out.println("====== LISTAR LIBROS ======");
        List<Libro> libros = inventarioLibros.listar();
        libros.forEach(System.out::println);

        Inventario<Revista> inventarioRevistas = new Inventario<>();
        inventarioRevistas.add(new Revista("R1","A1",2015,"E1","Enero"));
        inventarioRevistas.add(new Revista("R2","A2",2015,"E2","Enero1"));
        inventarioRevistas.add(new Revista("R3","A3",2015,"E3","Enero2"));

        System.out.println("====== LISTAR REVISTAS ======");
        List<Revista> revistas = inventarioRevistas.listar();
        revistas.forEach(System.out::println);

        Inventario<Periodico> inventarioPeriodicos = new Inventario<>();
        inventarioPeriodicos.add(new Periodico("P1","B1",1245,"12-12-2001"));
        inventarioPeriodicos.add(new Periodico("P2","B2",1244,"12-12-2002"));
        inventarioPeriodicos.add(new Periodico("P3","B3",1235,"12-12-2003"));

        System.out.println("====== LISTAR PERIODICOS ======");
        List<Periodico> periodicos = inventarioPeriodicos.listar();
        periodicos.forEach(System.out::println);

        //BUSCAR TITULO
        try{
            MaterialBiblioteca material = inventarioPeriodicos.porTitulo("P1");
            System.out.println("\nMaterial encontrado!");
            System.out.println(material.mostrarClase());
        }catch (MaterialNoEncontradoException e){
            System.out.println(e.getMessage());
        }

        //BUSCAR POR AÑO
        System.out.println("==== FILTRADO POR AÑO 2015 ====");
        inventarioRevistas.porAnio(2015).forEach(System.out::println);

    }
}
