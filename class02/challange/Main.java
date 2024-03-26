import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {
        
        LocalDate currentDate = LocalDate.now();

        Person[] people = new Person[4];
        for (int i = 0; i < people.length; i++)
            people[i] = new Person();

        int dayOfMonth = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        people[0].setName("Grace Hopper");
        people[1].setName("Ada Lovelace");
        people[2].setName("BL");
        people[3].setName("Lucas Lopes");

        people[0].setBirthday(9, 12, 1906);
        people[1].setBirthday(10, 12, 1815);
        people[2].setBirthday(25, 9, 2006);
        people[3].setBirthday(30, 8, 2003);

        people[0].calculateAge(dayOfMonth, month, year);
        people[1].calculateAge(dayOfMonth, month, year);
        people[2].calculateAge(dayOfMonth, month, year);
        people[3].calculateAge(dayOfMonth, month, year);

        for (int i = 0; i < people.length; i++)
            people[i].printInfo();
    }
}
