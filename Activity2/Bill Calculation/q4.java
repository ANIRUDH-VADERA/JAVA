package activity2;

import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        int units;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the units consumed for calculating Electricity Bill : ");
        units = scanner.nextInt();
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        if (units <= 100) {
            System.out.print("Electricity Bill : Rs 200");
        } else {
            units = units - 100;
            float bill = 0;
            if (units <= 50) {
                bill += 200;
                bill += 0.60 * units;
                System.out.print("Electricity Bill : Rs " + bill);
            } else {
                units = units - 50;
                bill = 0;
                if (units <= 50) {
                    bill += 200;
                    bill += 0.6 * 50;
                    bill += 1.2 * units;
                    System.out.print("Electricity Bill : Rs " + bill);
                } else {
                    units = units - 50;
                    bill = 0;
                    if (units <= 50) {
                        bill += 200;
                        bill += 0.6 * 50;
                        bill += 1.2 * 50;
                        bill += 2.4 * units;
                        System.out.print("Electricity Bill : Rs " + bill);
                    }
                }
            }
        }
        scanner.close();
    }
}
