package activity4;

import java.util.Scanner;

class matrixaddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int r = in.nextInt();
        System.out.println("Enter the no of columns :");
        int c = in.nextInt();
        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];
        System.out.println("Enter the elements of matrix 1 :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2 :");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }
        int result_matrix[][] = new int[r][c];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                result_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        System.out.println("The result matrix is :");
        for (int i = 0; i < result_matrix.length; i++) {
            for (int j = 0; j < result_matrix[i].length; j++) {
                System.out.print(result_matrix[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
