
public class Person {

    private String name;
    private Date birthDate;
    private int age;

    public void setBirthday(int birthDay, int birthMonth, int birthYear) {
        birthDate = new Date(birthDay, birthMonth, birthYear);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void calculateAge(int currentDay, int currentMonth, int currentYear) {
        if (currentMonth > birthDate.getMonth() || (currentMonth == birthDate.getMonth() && currentDay >= birthDate.getDay())) {
            age = currentYear - birthDate.getYear();
        } else {
            age = currentYear - birthDate.getYear() - 1;
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Birth Date: ");
        birthDate.print();
    }
}
