package agenda;

/**
 *
 * @author Sam
 */
public class EventoT1 extends Evento {
    private String requirement;
    private String course;

    public EventoT1(String place, String date, String requirement, String course) {
        super(place, date);
        this.requirement = requirement;
        this.course = course;
    }

    @Override
    public void imprimir() {
        System.out.println("EVENTO 1 : " + this.toString());
        EventoT1Frame pantalla = new EventoT1Frame();
        pantalla.jTextFieldplace.setText(this.getPlace());
        pantalla.jTextFielddate.setText(this.getDate());
        pantalla.jTextFieldrequi.setText(this.requirement);
        pantalla.jTextFieldcourse.setText(this.course);
        pantalla.setVisible(true);
        
    }

    @Override
    public String toString() {
        return "EventoT1{" + super.toString() + "requirement=" + requirement + ", course=" + course + '}';
    }
    
    
}
