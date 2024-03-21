import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner();

        Person[] users = new Person[5];
        int avrg = 0;

        System.out.println("Enter 5 age's: ");
        for(int i = 0; i < 5; i++) {
            users[i] = input.nextInt();
            avrg += users[i];    
        }

        System.out.println("Average: " + avrg);

        System.out.println("Below avrg: ");
        for(int i = 0; i < 5; i++) {
            if (users[i] < avrg) {
                System.out.println(users[i] + ", ");
            }
        }

        System.out.println("Above avrg: ");
        for(int i = 0; i < 5; i++) {
            if (users[i] > avrg) {
                System.out.println(users[i] + ", ");
            }
        }

        input.close();
    }
}
