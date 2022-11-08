package Classes;

public class Prestamo {
    private int id_prestamo;
    private int id_socio;
    private int codigo_libro;
    private String fecha;

    public Prestamo(int id_prestamo, int id_socio, int codigo_libro, String fecha) {
        this.id_prestamo = id_prestamo;
        this.id_socio = id_socio;
        this.codigo_libro = codigo_libro;
        this.fecha = fecha;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public int getId_socio() {
        return id_socio;
    }

    public int getCodigo_libro() {
        return codigo_libro;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prestamo {");
        sb.append("Id prestamo = ").append(id_prestamo);
        sb.append(", Id socio = ").append(id_socio);
        sb.append(", Codigo libro = ").append(codigo_libro);
        sb.append(", Fecha = ").append(fecha).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
