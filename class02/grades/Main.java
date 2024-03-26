import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");

        int rows = input.nextInt();
        int columns = 4; // number of grades
 
        float[][] studentGrades = new float[rows][columns];
        float classBiggestGrade = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("[Student %d][Grade %d] = ", i+1, j+1);
                studentGrades[i][j] = input.nextFloat(); 
            }
        }
        
        for (int i = 0; i < rows; i++) {
            float studentBiggestGrade = 0;
            for (int j = 0; j < columns; j++) {
                float grade = studentGrades[i][j]; 
                if (grade > studentBiggestGrade) 
                    studentBiggestGrade = grade;
            }
            System.out.printf("[Student %d] Biggest Grade = %f\n", i, studentBiggestGrade);
            if (studentBiggestGrade > classBiggestGrade)
                classBiggestGrade = studentBiggestGrade;
        }


        System.out.printf("Biggest Class Grade = %f\n", classBiggestGrade);

        input.close();
    }
}
