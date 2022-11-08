package Figuras;

public class Cuadrado extends ObjetoGeometrico {

    private int lado;

    public Cuadrado(int lado) {
        super();
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public void calcularAreaYPerimetro() {
        System.out.println("Calcular area y perimetro de cuadrado");
        setArea(getLado() * getLado());
        System.out.println("Area: "+getArea());
        setPerimetro(getLado()+getLado()+getLado()+getLado());
        System.out.println("Perimetro: "+getPerimetro());
    }
    @Override
    public void dibujar() {
        System.out.println('\n'+"El cuadrado tiene: ");
        System.out.println("Medida del lado: "+ getLado());
        System.out.println("Perimetro: "+ getPerimetro());
        System.out.println("Area: "+getArea());

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuadrado{");
        sb.append("Lado=").append(lado).append(", ");
        sb.append("Area=").append(getArea()).append(", ");
        sb.append("Perimetro=").append(getPerimetro());
        sb.append('}');
        return sb.toString();
    }
}
