import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        int wordCount = 0;

        String[] words = phrase.split(" ");
        wordCount = words.length;

        System.out.printf("Word Count = %d\n", wordCount);

        input.close();
    }
}
