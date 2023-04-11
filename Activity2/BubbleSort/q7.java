package activity2;

import java.util.Scanner;

class q7 {

    static void BubbleSort(int[] array, int length) {
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < (length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping the required elements
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array :");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        System.out.println("The array before sorting is :");
        System.out.print("Array = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        // Applying Bubble Sort
        BubbleSort(array, n);

        System.out.println("The array after sorting is :");
        System.out.print("Array(Sorted) = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        in.close();
    }
}
