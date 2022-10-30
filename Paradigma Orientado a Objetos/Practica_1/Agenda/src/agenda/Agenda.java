package agenda;

import java.util.LinkedList;

/**
 *
 * @author Sam
 */
public class Agenda {
    private LinkedList<Contacto> contactos;
    private LinkedList<Evento> eventos;

    public Agenda() {
        this.contactos = new LinkedList<Contacto>();
        this.eventos = new LinkedList<Evento>();
    }
    
    public void agregarEvento(Evento e){
        this.eventos.add(e);
    }

    //Agregar Contacto
    public void agregarContacto(Contacto c){
        this.contactos.add(c);
    }
    
    public void eliminarContacto(int id){
        for(Contacto c : this.contactos){
            if(c.getPersona().getID() == id){
                this.contactos.remove(c);
            }
        }
    }
    
    //modificar Contacto

    //imprimirContactos
    public void imprimirContactos(){
        for(Contacto c : this.contactos)
            c.imprimir();
        
        for(Evento e : this.eventos)
            e.imprimir();
    }
    
}
