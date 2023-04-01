package activity1;

import java.util.Scanner;

class O_E {
    public static void main(String[] args) {
        System.out.println("Enter the method:");
        System.out.println("1 : if");
        System.out.println("2 : switch");
        Scanner in = new Scanner(System.in);
        int flag = in.nextInt();
        if (flag == 1) {
            System.out.println("Enter the number:");
            int number = in.nextInt();
            System.out.println();
            System.out.println("ANIRUDH VADERA (20BCE2940)");
            System.out.println();
            if (number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }
        } else {
            System.out.println("Enter the number:");
            int number = in.nextInt();
            int f = number % 2;
            System.out.println();
            System.out.println("ANIRUDH VADERA (20BCE2940)");
            System.out.println();
            switch (f) {
                case 0:
                    System.out.println("The number is Even");
                    break;
                case 1:
                    System.out.println("The number is Odd");
                    break;
            }
        }
        in.close();
    }
}
