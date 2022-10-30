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
public abstract class Contacto extends Object{
    private Persona persona;
    private String address;
    private int phone;
  

    public Contacto(Persona persona, String address, int phone){
        this.persona    = persona;
        this.address    = address;
        this.phone      = phone;
    }
    
    public Contacto(int id, String name, int age, String genre, String address, int phone){
        this.persona    = new Persona(id, name, age, genre);
        this.address    = address;
        this.phone      = phone;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }
    
    public abstract void imprimir();

    @Override
    public String toString() {
        return "Contacto {" + "Persona=" + persona + ", Address=" + address + ", Phone=" + phone + '}';
    }

    
}
