package Figuras;

import java.util.ArrayList;

public class Hoja{

    private ArrayList<Grupo> objetos;

    public Hoja() {
        super();
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(Grupo grupo){
        objetos.add(grupo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hoja{");
        sb.append("Objetos=").append(objetos);
        sb.append('}');
        return sb.toString();
    }
}
