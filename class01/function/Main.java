import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter a number: ");

        int x = input.nextInt();

        if (x >= 0 && x < 5)
            System.out.printf("f(%d) = %d\n", x, x);
        else if (x < 10)
            System.out.printf("f(%d) = %d\n", x, 2*x + 1);
        else if (x >= 10) 
            System.out.printf("f(%d) = %d\n", x, x - 3);
        else 
            System.out.printf("Error! usage: x > 0!\n");

        input.close();
    }        
}
