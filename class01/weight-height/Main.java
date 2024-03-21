import java.util.Scanner;

public class Main {
   
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int overWeightCount = 0;

        while (true) {

            System.out.printf("weight:\n");
            int weight = input.nextInt();             

            if (weight == -1)
                break;

            System.out.printf("height:\n");
            int height = input.nextInt();             

            if (height == -1)
                break;

            if ((weight / (height * height)) > 25)
                overWeightCount++;
        };

        System.out.printf("over weight count: %d\n", overWeightCount);

        input.close();
    }
}
