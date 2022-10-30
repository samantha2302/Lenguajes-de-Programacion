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
public class ContactoT2 extends Contacto{
    private String facebook;
    private String telegram;

    public ContactoT2(Persona persona, String address, int phone, String facebook, String telegram) {
        super(persona, address, phone);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    public ContactoT2(int id, String name, int age, String genre, String address, int phone, String facebook, String telegram) {
        super(id, name, age, genre, address, phone);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    @Override
    public void imprimir() {
       System.out.println("CONTACTO2 : " + this.toString());
       ContactoT2Frame pantalla = new ContactoT2Frame();
       pantalla.jTextFieldid.setText(String.valueOf(this.getPersona().getID()));
       pantalla.jTextFieldname.setText(this.getPersona().getName());
       pantalla.jTextFieldage.setText(String.valueOf(this.getPersona().getAge()));
       pantalla.jTextFieldgenre.setText(this.getPersona().getGenre());
       pantalla.jTextFieldaddress.setText(this.getAddress());
       pantalla.jTextFieldfacebook.setText(this.facebook);
       pantalla.jTextFieldtelegram.setText(this.telegram);
       pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "ContactoT2 {"+ super.toString() + "facebook=" + facebook + ", telegram=" + telegram + '}';
    }
    
    
    
    
}
