
public class Employe {

    protected String name;
    protected int id;
    protected boolean stranger;
    protected Date date;

    public Employe () {

    } 

    public Employe(String name, int id, boolean stranger, int day, int month, int year) {
        this.setName(name);
        this.setId(id);
        this.setStranger(stranger);
        this.date = new Date(day, month, year); 
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStranger(boolean stranger) {
        this.stranger = stranger;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isStranger() {
        return stranger;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return String.format("%s:\nID: %d\nStranger: %s\nStart: %s", name, id, isStranger() ? "yes" : "no", date);
    }
}
