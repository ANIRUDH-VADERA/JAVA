package activity4;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - ((i + 1) * 2)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * n - ((i + 1) * 2)) / 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < (2 * n - ((i + 1) * 2)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * n - ((i + 1) * 2)) / 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }

}