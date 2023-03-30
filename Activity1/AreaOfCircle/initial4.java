package activity1;

import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        System.out.println("Enter the value of pi:");
        Scanner in = new Scanner(System.in);
        double pi = in.nextDouble();
        System.out.println("Enter the radius:");
        double radius = in.nextDouble();
        double area = pi * radius * radius;
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println();
        System.out.println("The area is:");
        System.out.println(area);
        in.close();
    }
}
