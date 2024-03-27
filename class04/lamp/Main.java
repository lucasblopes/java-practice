import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instantiate FluorLamp object
        FluorLamp fluorLamp = new FluorLamp(true, 15);

        // Instantiate LedLamp object
        LedLamp ledLamp = new LedLamp(false);

        System.out.println("Choose a lamp:");
        System.out.println("1. Fluorescent Lamp");
        System.out.println("2. LED Lamp");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                handleLamp(fluorLamp);
                break;
            case 2:
                handleLamp(ledLamp);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void handleLamp(Lamp lamp) {
        lamp.print();
        System.out.println("Do you want to toggle the lamp? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        if (input == 'Y' || input == 'y') {
            lamp.setOn(!lamp.isOn());
            System.out.println("The lamp is now " + (lamp.isOn() ? "on" : "off"));
        } else {
            System.out.println("No action taken. The lamp remains " + (lamp.isOn() ? "on" : "off"));
        }
    }
}

