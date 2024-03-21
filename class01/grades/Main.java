import java.util.Scanner;

public class Main {

    static public void main(String arg[]) {

        Scanner input = new Scanner(System.in);
        int nStudents = 30;
        int nGrades = 4;
        int biggestClassGrade = 0;

        for (int i = 0; i < nStudents; i++) {

            System.out.printf("Student %d grades:\n", i+1);
            
            int biggestStudentGrade = 0;
            for (int j = 0; j < nGrades; j++){
                System.out.printf("grade %d:\n", j+1);
                int grade = input.nextInt();
                if (grade > biggestStudentGrade)
                    biggestStudentGrade = grade;
            }
            System.out.printf("Student %d biggest grade:\n", biggestStudentGrade);

            if (biggestStudentGrade > biggestClassGrade)
                biggestClassGrade = biggestStudentGrade;
        }

        System.out.printf("Biggest class grade %d:\n", biggestClassGrade);
    }
}
