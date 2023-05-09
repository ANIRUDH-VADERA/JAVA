package activity4;

import java.util.Scanner;

class sumdiagnols {

    static int diagnolSum(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
                if ((i + j) == array.length - 1) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int r = in.nextInt();
        System.out.println("Enter the no of columns :");
        int c = in.nextInt();
        int array[][] = new int[r][c];
        System.out.println("Enter the elements :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int sum = diagnolSum(array);
        System.out.println("The diagnol sum is :" + sum);
        in.close();
    }
}
