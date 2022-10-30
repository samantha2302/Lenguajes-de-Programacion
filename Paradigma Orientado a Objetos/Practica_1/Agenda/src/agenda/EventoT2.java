package agenda;

/**
 *
 * @author Sam
 */
public class EventoT2 extends Evento{
    private int number_of_guests;
    private String food_dish;

    public EventoT2(String place, String date, int number_of_guests, String food_dish) {
        super(place, date);
        this.number_of_guests = number_of_guests;
        this.food_dish = food_dish;
    }

    public int getNumber_of_guests() {
        return number_of_guests;
    }

    public String getFood_dish() {
        return food_dish;
    }

    @Override
    public void imprimir() {
         System.out.println("EVENTO 2 : " + this.toString());
        EventoT2Frame pantalla = new EventoT2Frame();
        pantalla.jTextFieldplace.setText(this.getPlace());
        pantalla.jTextFielddate.setText(this.getDate());
        pantalla.jTextFieldguests.setText(String.valueOf(this.number_of_guests));
        pantalla.jTextFieldfood.setText(this.food_dish);
        pantalla.setVisible(true);
        
    }

    @Override
    public String toString() {
        return "EventoT2{"+ super.toString() + "Number_of_guests=" + number_of_guests + ", Food_dish=" + food_dish + '}';
    }
    
    
    
    
}
