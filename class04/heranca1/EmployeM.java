
public class EmployeM extends Employe {

    private int salary;
    
    public EmployeM(String name, int id, boolean stranger, int day, int month, int year, int salary) {
        super(name, id, stranger, day, month, year);
        this.setSalary(salary);
    }

    public void setSalary(int salary) {
        if (salary >= 0)
            this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    
}
