
public class Person {

    private String name;
    private int age;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public void setBirthday(int birthDay, int birthMonth, int birthYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
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

    public void setAge(int currentDay, int currentMonth, int currentYear) {
        if (currentMonth > birthMonth || (currentMonth == birthMonth && currentDay >= birthDay)) {
            age = currentYear - birthYear;
        } else {
            age = currentYear - birthYear - 1;
        }
    }
}
