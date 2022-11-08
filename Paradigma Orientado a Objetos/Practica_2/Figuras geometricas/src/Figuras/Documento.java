package Figuras;

import java.util.ArrayList;

public class Documento {
    private ArrayList<Hoja> Hojas;

    public Documento() {
        this.Hojas = new ArrayList<>();
    }

    public void agregarHojas(Hoja hoja){
        Hojas.add(hoja);
    }

    public ArrayList<Hoja> getHojas() {
        return Hojas;
    }

    public void setHojas(ArrayList<Hoja> hojas) {
        Hojas = hojas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Documento{");
        sb.append("Hojas=").append(Hojas);
        sb.append('}');
        return sb.toString();
    }
}
