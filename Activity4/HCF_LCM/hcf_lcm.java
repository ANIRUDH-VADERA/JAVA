package activity4;

import java.util.Scanner;

class hcf_lcm {
    public static void main(String[] args) {
        int temp1, temp2, x, y, temp, hcf, lcm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        x = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        y = scanner.nextInt();

        temp1 = x;
        temp2 = y;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (x * y) / hcf;

        System.out.println("ANIRUDH VADERA(20BCE2940)");
        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);
        scanner.close();
    }
}
