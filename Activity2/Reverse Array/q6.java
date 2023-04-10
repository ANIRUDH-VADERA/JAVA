package activity2;

import java.util.Scanner;

class q6 {

    static void display(int[] array, int length) {
        System.out.print("Marks = [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    static void display_reverse(int[] array, int length) {
        System.out.print("Marks(Reverse) = [ ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int n = in.nextInt();
        System.out.println("Enter the marks for n students :");
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = in.nextInt();
        }
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        display(marks, n);
        display_reverse(marks, n);
        in.close();
    }
}
