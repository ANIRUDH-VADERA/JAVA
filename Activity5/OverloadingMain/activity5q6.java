package activity5;

import java.util.Scanner;

public class activity5q6 {

    public static boolean prime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Overloaded main
    // According to us this overloaded method
    // Should be executed when int value is passed
    public static void main(int args) {
        System.out.println("main() overloaded");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers in array : ");
        int n = in.nextInt();
        int[] array = new int[n];
        int prime = 0;
        int composite = 0;
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (prime(array[i])) {
                prime = prime + 1;
            } else {
                composite = composite + 1;
            }
        }
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println();
        System.out.println("The number of prime numbers in the given array are : " + prime);
        System.out.println("The number of composite numbers in the given array are : " + composite);
        in.close();
    }

    // Original main()
    public static void main(String[] args) {
        System.out.println("Original main()" + " Executing");
        activity5q6.main(10);
    }
}
