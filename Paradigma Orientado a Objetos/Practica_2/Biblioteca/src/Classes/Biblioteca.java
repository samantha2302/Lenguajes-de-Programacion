package Classes;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombre;
    private LinkedList<Socio> socios;
    private LinkedList<Libro> libros;
    private LinkedList<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.socios = new LinkedList<Socio>();
        this.libros = new LinkedList<Libro>();
        this.prestamos = new LinkedList<>();
    }

    public void agregarSocios(Socio socio){
        socios.add(socio);
    }

    public void agregarLibros(Libro libro){
        libros.add(libro);
    }

    public void agregarPrestamo(Prestamo prestamo){
        for (Socio socio : socios){
            for(Libro libro : libros){
                if( (socio.getId() == prestamo.getId_socio()) && (libro.getCodigo() == prestamo.getCodigo_libro())){
                   if(libro.isDisponibilidad() && socio.getLibros().size() <= 3){
                       socio.librosPrestados(libro);
                       libro.setDisponibilidad(false);
                       prestamos.add(prestamo);
                   }else{
                       System.out.println("El libro no se encuentra disponible o el socio ya no tiene permitido obtener mas libros.");
                   }
                }
            }
        }
    }

    public String cantidadDeSociosLibros(){
        List<Socio> listaSocios = socios.stream()
                .filter(socio -> socio.getLibros().size() > 3)
                .collect(Collectors.toList());

        final StringBuffer sb = new StringBuffer("\n");
        for (Socio s : socios) {
            sb.append(s.toString() + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", socios=").append(socios);
        sb.append(", libros=").append(libros);
        sb.append(", prestamos=").append(prestamos);
        sb.append('}');
        return sb.toString();
    }
}
