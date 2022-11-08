package Figuras;

public class Circulo extends ObjetoGeometrico {
    private int radio;

    public Circulo(int radio) {
        super();
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public void calcularAreaYPerimetro() {
        System.out.println("Calcular area y perimetro de circulo");
        double pi = 3.14;
        double total = Math.pow(getRadio(), 2);
        setArea((int) (pi * total));
        System.out.println("Area: "+getArea());

        setPerimetro((int) (pi*getRadio()*2));
        System.out.println("Perimetro: " +getPerimetro());
    }

    @Override
    public void dibujar() {
        System.out.println('\n'+"El circulo tiene:");
        System.out.println("Medida del radio: "+ getRadio());
        System.out.println("Perimetro: "+ getPerimetro());
        System.out.println("Area: "+getArea());

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circulo{");
        sb.append("radio=").append(radio).append(", ");
        sb.append("Area=").append(getArea()).append(", ");
        sb.append("Perimetro=").append(getPerimetro());
        sb.append('}');
        return sb.toString();
    }
}
