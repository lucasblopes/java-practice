import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hour and min for time1:");
        Time time1 = new Time(input.nextInt(), input.nextInt());

        System.out.println("Enter hour and min for time2:");
        Time time2 = new Time(input.nextInt(), input.nextInt());

        time1.toString();
        time2.toString();

        if (time1.isEquals(time2.getHour(), time2.getMin()))
            System.out.println("time1 is equals to time2");
        else if (time1.isPrevious(time2.getHour(), time2.getMin()))
            System.out.println("time1 is after to time2");
        else if (time1.isAfter(time2.getHour(), time2.getMin()))
            System.out.println("time1 is previous to time2");
        
        input.close();
    }
}
