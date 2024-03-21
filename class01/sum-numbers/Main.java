import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in); 
        int sum = 0;
        int number = 0;

        while (number != -1) {
            System.out.println("Enter a number: ");
            number = input.nextInt();
            sum += number;
        }

        System.out.println("sum " + sum);

        input.close();
    }        
}
