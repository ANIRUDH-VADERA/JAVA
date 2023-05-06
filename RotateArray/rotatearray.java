package activity4;

public class rotatearray {

    void leftrotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftrotatebyone(arr, n);
    }

    void leftrotatebyone(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }

    void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        rotatearray rotate = new rotatearray();
        int arr[] = { 11, 12, 13, 14, 15, 16 };
        rotate.leftrotate(arr, 4, 6);
        rotate.printarray(arr, 6);
    }

}
