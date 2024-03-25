
public class Student {

    private double grade;
    private String name;

    public Student() {

    }

    public Student(String name, double grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
        this.name = name;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(this.name + " : " + this.grade + " pts.");
    }
}
