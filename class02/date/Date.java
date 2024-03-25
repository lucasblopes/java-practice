
public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {

    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
