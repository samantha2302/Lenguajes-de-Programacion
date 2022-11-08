package Figuras;

public abstract class ObjetoGeometrico implements ObjetoRepresentable {
    private int area;
    private int perimetro;

    public ObjetoGeometrico(int area, int perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    /**
     * Constructor vacio.
     */
    public ObjetoGeometrico() {
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public abstract void calcularAreaYPerimetro();

    @Override
    public abstract void dibujar();
}

