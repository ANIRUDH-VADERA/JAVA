package activity4;

import java.util.Scanner;
import java.lang.Math;

class array {

    static float average(int array[]) {
        float average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = in.nextInt();
        System.out.println("Enter the n values :");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("The elements of the array are :");
        for (int data : array) {
            System.out.print(data + " ");
        }
        System.out.println("\n");
        float average = average(array);
        System.out.println("The average is :" + average + "\n");
        System.out.println("The difference in values is :");
        for (int i = 0; i < n; i++) {
            System.out.println("The orginal value : " + array[i] + "\t");
            System.out.println("The difference value : " + Math.abs(average - array[i]));
        }
        in.close();
    }
}
