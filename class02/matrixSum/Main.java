import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        int[][] matrixSum = new int[3][3];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.printf("matrixA[%d][%d] = ", i, j);
                matrixA[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                System.out.printf("matrixB[%d][%d] = ", i, j);
                matrixB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum.length; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.printf("matrix(A + B)[%d][%d] = %d\n", i, j, matrixSum[i][j]);
            }
        }

        input.close();
    }
}
