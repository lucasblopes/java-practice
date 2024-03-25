import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Date birthday = new Date();

        birthday.setDate(30, 8, 2003);
        birthday.printDate();

        input.close();
    }
}
