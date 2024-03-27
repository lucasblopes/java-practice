import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date[] dates = new Date[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter date " + (i + 1) + " (day, month, and year separated by space):");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            dates[i] = new Date(day, month, year);
        }

        Date smallestDate = dates[0];
        Date largestDate = dates[0];

        for (int i = 1; i < dates.length; i++) {
            if (dates[i].isPrevious(smallestDate.getDay(), smallestDate.getMonth(), smallestDate.getYear())) {
                smallestDate = dates[i];
            }
            if (dates[i].isAfter(largestDate.getDay(), largestDate.getMonth(), largestDate.getYear())) {
                largestDate = dates[i];
            }
        }

        System.out.println("Smallest date: " + smallestDate);
        System.out.println("Largest date: " + largestDate);
    }
}

