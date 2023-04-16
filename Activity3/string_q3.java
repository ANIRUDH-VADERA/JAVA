package activity3;

import java.util.Scanner;

class string_q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of names to be stored :");
        int n = in.nextInt();
        String[] array = new String[n];
        in.nextLine();
        System.out.println("Enter the names to be stored :");
        for (int i = 0; i < n; i++) {
            String Name = in.nextLine();
            array[i] = Name;
        }
        System.out.println("The Name array is :");
        System.out.print("[ ");
        for (String data : array) {
            System.out.print(data + "  ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Enter the name to be searched :");
        String name = in.nextLine();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        int flag = 0;
        int pos = 0;
        int x = 0;
        for (String data : array) {
            x++;
            if (data.matches("Dr. " + name)) {
                System.out.println("JHo");
                flag = 1;
                pos = x;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("Name Not Found");
        } else {
            System.out.println("Name Found at position : " + pos);
        }
        in.close();
    }
}
