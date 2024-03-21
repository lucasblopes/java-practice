import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in); 
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += 3*i;
        }

        System.out.println("sum " + sum);

        input.close();
    }        
}
