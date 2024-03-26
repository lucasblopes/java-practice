
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a complete name:");
        String phrase = input.nextLine();
        String formatedName;

        String[] words = phrase.split(" ");

        // Make sure all words starts with UpperCase
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }

        // Remove "." at the end, if it exists
        if (words[words.length - 1].endsWith("."))
            words[words.length - 1] = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);

        formatedName = words[words.length-1].concat(", " + words[0].charAt(0) + ".");

        System.out.println(formatedName);

        input.close();
    }
}
