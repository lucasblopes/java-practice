import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Student[] students = new Student[5];
        double avrg = 0;
        int bellowAvrgCount = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.printf("Student %d name, grade: ", i + 1);
            students[i].setName(input.nextLine());
            students[i].setGrade(input.nextDouble());
            input.nextLine();
            avrg += students[i].getGrade();
        }

        avrg /= students.length;
        System.out.println("Average class grade: " + avrg);

        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() < 40)
                bellowAvrgCount++;
        }

        System.out.println("Bellow Average: " + bellowAvrgCount);

        System.out.println("Approved Students:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() >= 70)
                students[i].print();
        }
        
        input.close();
    }
}
