
public class EmployeH extends Employe {

    private int startHour;
    private int duration;
    private int salary;
    
    public EmployeH(String name, int id, boolean stranger, int day, int month, int year, int salary, int startHour,
            int duration) {
        super(name, id, stranger, day, month, year);
        this.setStartHour(startHour);
        this.setDuration(duration);
    }

    public void setStartHour(int startHour) {
        if (salary >= 0)
            this.startHour = startHour;
    }
    
    public void setDuration(int duration) {
        if (duration >= 1 && duration <= 18)
            this.duration = duration;
    }

    public int getSalary() {
        return salary;
    }

    public int getStartHour(int startHour) {
        return startHour;
    }

}
