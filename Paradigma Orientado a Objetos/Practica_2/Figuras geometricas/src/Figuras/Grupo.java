package Figuras;

import java.util.ArrayList;

public class Grupo implements ObjetoRepresentable {
    ArrayList<ObjetoRepresentable> elementos;

    public Grupo() {
        this.elementos = new ArrayList<>();
    }

    public void agregarObjRepresentable(ObjetoRepresentable objetoRepresentable){
        elementos.add(objetoRepresentable);
    }

    public ArrayList<ObjetoRepresentable> getElementos() {
        return elementos;
    }

    @Override
    public void dibujar() {
        System.out.println("Este grupo de objetos representables tiene:");
        System.out.println(getElementos());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Grupo{");
        sb.append("Elementos=").append(elementos);
        sb.append('}');
        return sb.toString();
    }
}
