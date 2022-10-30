package agenda;

/**
 *
 * @author Sam
 */
public class ContactoT1 extends Contacto{
    private String mail;

    public ContactoT1(Persona persona, String address, int phone, String mail) {
        super(persona, address, phone);
        this.mail = mail;
    }

    public ContactoT1(int id, String name, int age, String genre, String address, int phone,  String mail){
        super(id, name, age, genre, address, phone);
        this.mail = mail;
    }

    @Override
    public void imprimir() {
       System.out.println("CONTACTO1 : " + this.toString());
       ContactoT1Frame pantalla = new ContactoT1Frame();
       pantalla.jTextFieldid.setText(String.valueOf(this.getPersona().getID()));
       pantalla.jTextFieldname.setText(this.getPersona().getName());
       pantalla.jTextFieldage.setText(String.valueOf(this.getPersona().getAge()));
       pantalla.jTextFieldgenre.setText(this.getPersona().getGenre());
       pantalla.jTextFieldaddress.setText(this.getAddress());
       pantalla.jTextFieldphone.setText(String.valueOf(this.getPhone()));
       pantalla.jTextFieldmail.setText(this.mail);
       pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "ContactoT1{" + super.toString() + "mail=" + mail + '}';
    }
}
