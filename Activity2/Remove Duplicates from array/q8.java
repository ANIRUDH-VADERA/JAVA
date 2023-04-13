package activity2;

import java.util.Scanner;

class q8 {

    static int RemoveDuplicates(int[] array) {
        int new_length = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[new_length++] = array[i];
            }
        }
        array[new_length++] = array[n - 1];
        // Storing the new elements in the original array
        return new_length;
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
        System.out.println("The array before removing duplicates is :");
        System.out.print("Array = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        // Removing the Duplicate elements and recieving the new length of the array
        int new_length = RemoveDuplicates(array);

        System.out.print("Array(Duplicate removed) = [ ");
        for (int i = 0; i < new_length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        in.close();
    }
}
