package activity2;

import java.util.Scanner;

class q9 {

    static void Identity(int matrix[][]) {
        int flag = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        flag = 0;
                        break;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        flag = 0;
                        break;
                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println("The entered matrix is not a Identity matrix:");
        } else {
            System.out.println("The entered matrix is a Identity matrix:");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int r = in.nextInt();
        System.out.println("Enter the no of columns :");
        int c = in.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter the elements of matrix 1 :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        System.out.println("The matrix entered is :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Checking for identity matrix
        Identity(matrix);

        in.close();
    }
}
