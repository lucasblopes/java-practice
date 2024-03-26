import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {
        
        LocalDate currentDate = LocalDate.now();

        Person personA = new Person();
        Person personB = new Person();
        Person personC = new Person();
        Person personD = new Person();

        int dayOfMonth = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        personA.setName("Grace Hopper");
        personB.setName("Ada Lovelace");
        personC.setName("Byanca Libano");
        personD.setName("Lucas Lopes");

        personA.setBirthday(9, 12, 1906);
        personB.setBirthday(10, 12, 1815);
        personC.setBirthday(7, 3, 2006);
        personD.setBirthday(30, 8, 2003);

        personA.setAge(dayOfMonth, month, year);
        personB.setAge(dayOfMonth, month, year);
        personC.setAge(dayOfMonth, month, year);
        personD.setAge(dayOfMonth, month, year);

        System.out.println(personA.getName() + ": " + personA.getAge() + " years.");
        System.out.println(personB.getName() + ": " + personB.getAge() + " years.");
        System.out.println(personC.getName() + ": " + personC.getAge() + " years.");
        System.out.println(personD.getName() + ": " + personD.getAge() + " years.");

    }
}
