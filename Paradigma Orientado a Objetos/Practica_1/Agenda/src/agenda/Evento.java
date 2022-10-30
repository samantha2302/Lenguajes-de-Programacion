package agenda;

/**
 *
 * @author Sam
 */
public abstract class Evento {
    private String place;
    private String date;

    public Evento(String place, String date) {
        this.place = place;
        this.date = date;
    }
    
    public String getPlace() {
        return place;
    }
    
    public String getDate() {
        return date;
    }
    
    public abstract void imprimir();

    @Override
    public String toString() {
        return "Evento {" + "Place=" + place + ", Date=" + date + '}';
    }

    
    
}
