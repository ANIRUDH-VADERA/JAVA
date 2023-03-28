package activity1;

import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        System.out.println("Enter the principal:");
        Scanner in = new Scanner(System.in);
        double p = in.nextDouble();
        System.out.println("Enter the rate of interest per anum:");
        double r = in.nextDouble();
        System.out.println("Enter the no of years:");
        double t = in.nextDouble();
        double SI = (p * r * t) / 100;
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println();
        System.out.println("The Simple Interest is:");
        System.out.println(SI);
        in.close();
    }
}