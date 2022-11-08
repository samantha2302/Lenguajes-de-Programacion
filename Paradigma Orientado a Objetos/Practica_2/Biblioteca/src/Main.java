import Classes.Biblioteca;
import Classes.Libro;
import Classes.Prestamo;
import Classes.Socio;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        // Socios
        Socio socio1 = new Socio(1, "Kevelyn", "Santa Clara");
        Socio socio2 = new Socio(2, "Kristel", "Santa Clara");
        Socio socio3 = new Socio(3, "Katherine", "Santa Clara");
        Socio socio4 = new Socio(4, "Britani", "Santa Clara");

        // Libros
        Libro libro1 = new Libro(1, "Cronica de una muerte anunciada", "Gabriel García Márquez", true);
        Libro libro2 = new Libro(2, "Romancero gitano", "Federico García Lorca", true);
        Libro libro3 = new Libro(3, "Cien años de soledad", "Gabriel García Márquez", true);
        Libro libro4 = new Libro(4, "El amor en los tiempos del cólera", "Gabriel García Márquez", true);
        Libro libro5 = new Libro(5, "Grandes Esperanzas", "Charles Dickens", true);

        // Biblioteca
        Biblioteca biblioteca = new Biblioteca("Sam's");
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);
        biblioteca.agregarLibros(libro4);
        biblioteca.agregarLibros(libro5);

        biblioteca.agregarSocios(socio1);
        biblioteca.agregarSocios(socio2);
        biblioteca.agregarSocios(socio3);
        biblioteca.agregarSocios(socio4);

        biblioteca.agregarPrestamo(new Prestamo(1, 1, 1, "07/05/2002"));
        biblioteca.agregarPrestamo(new Prestamo(1, 1, 2, "07/05/2002"));
        biblioteca.agregarPrestamo(new Prestamo(1, 1, 3, "07/05/2002"));
        biblioteca.agregarPrestamo(new Prestamo(1, 1, 4, "07/05/2002"));

        System.out.println(biblioteca.cantidadDeSociosLibros());
        System.out.println(biblioteca.toString());

    }
}
