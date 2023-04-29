package activity4;

import java.util.Scanner;

class jagged_array {

    static void passed(int array[][]) {
        int pass_count = 0;
        int fail_count = 0;
        // Enhanced for loop
        for (int[] sub_array : array) {
            for (int data : sub_array) {
                if (data >= 40) {
                    pass_count++;
                } else {
                    fail_count++;
                }
            }
        }
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println("Number of subjects students has passed : " + pass_count);
        System.out.println("Number of subjects students has failed : " + fail_count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of arrays in the 2D array :");
        int n = in.nextInt();
        int jagged_array[][] = new int[n][];
        System.out.println("Enter the size of each array :");
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            jagged_array[i] = new int[x];
        }
        System.out.println("Enter the elements of each array in the 2D array :");
        for (int i = 0; i < jagged_array.length; i++) {
            System.out.println("Array :" + (i + 1));
            for (int j = 0; j < jagged_array[i].length; j++) {
                jagged_array[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println("The 2D array is :");
        for (int i = 0; i < jagged_array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < jagged_array[i].length; j++) {
                System.out.print(" " + jagged_array[i][j]);
            }
            System.out.print(" ]");
            System.out.println();
        }
        passed(jagged_array);
    }
}
