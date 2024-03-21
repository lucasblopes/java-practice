import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Telephone[] telephoneArray = new Telephone[5];

        for (int i = 0; i < 5; i++) {

            telephoneArray[i] = new Telephone();

            System.out.println("enter: (DDI) (DDD) (NUMBER):");

            int ddi;
            while (true) {
                ddi = input.nextInt();
                if (ddi != 1 && ddi != 55 && ddi != 61)
                    System.out.println("Invalid DDI! Try 1/55/61!");
                else
                    break;
            }
            int ddd = input.nextInt();
            long number = input.nextInt();

            telephoneArray[i].register(ddi, ddd, number);
        }

        for (int i = 0; i < 5; i++) {
            telephoneArray[i].print();
        }

        input.close();
    }
}
