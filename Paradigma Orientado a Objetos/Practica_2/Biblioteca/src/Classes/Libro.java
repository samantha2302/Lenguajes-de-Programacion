package Classes;

public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponibilidad;

    public Libro(int codigo, String titulo, String autor, boolean disponibilidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro {");
        sb.append("Codigo = ").append(codigo);
        sb.append(", titulo = ").append(titulo).append('\'');
        sb.append(", autor = ").append(autor).append('\'');
        sb.append(", disponibilidad = ").append(disponibilidad);
        sb.append('}');
        return sb.toString();
    }
}
