package Figuras;

public class Texto implements ObjetoRepresentable {
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void dibujar() {
        System.out.println("El texto tiene:");
        System.out.println(getTexto());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Texto{");
        sb.append("texto='").append(texto);
        sb.append('}');
        return sb.toString();
    }
}
