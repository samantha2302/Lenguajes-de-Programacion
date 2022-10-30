/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Sam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agendaPersonal = new Agenda();
        System.out.println("***AGREGANDO CONTACTOS Y EVENTOS***");
        //agendaPersonal.agregarContacto(new Contacto(new Persona("pablo",20,false),"no se donde","88888888"));
        agendaPersonal.agregarContacto(new ContactoT1(1 ,"Maria", 23, "Femenino", "Detras del mercado", 254897554,"maria@suCorreo.com" ));
        agendaPersonal.agregarContacto(new ContactoT1(2, "Pedro",24, "Masculino","Manantial", 367438923,"pedro@suCorreo.com" ));
        agendaPersonal.agregarContacto(new ContactoT2(1, "Luis", 30, "Masculino", "Detras del cementerio",76348342,"Luis DB","66348342"));
        
        agendaPersonal.agregarEvento(new EventoT1 ("Santa Clara", "21/10/2022", "Explicar proyecto","Lenguajes de programacion"));
        agendaPersonal.agregarEvento(new EventoT2("Buenos Aires", "22/10/2022", 20,"Arroz con pollo"));
        System.out.println("***IMPRIMIENDO CONTACTOS Y EVENTOS***");
        agendaPersonal.imprimirContactos();
    }
    
}
