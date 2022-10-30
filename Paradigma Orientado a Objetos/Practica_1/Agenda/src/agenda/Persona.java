package agenda;

/**
 *
 * @author Sam
 */
public class Persona {
    private int ID;
    private String name;
    private int age; 
    private String  genre;
    
    public Persona(int id, String name, int age, String genre){
        this.ID             = id;
        this.name           = name;
        this.age            = age;
        this.genre          = genre;
        
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }
    
    @Override
    public String toString() {
        return "Persona {" + "ID=" + ID + ", Name=" + name + ", Age=" + age + ", Genre=" + genre + '}';
    }
}
