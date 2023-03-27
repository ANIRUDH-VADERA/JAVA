package activity1;

import java.util.Scanner;
import java.lang.Math;

class BMI {
    public static void main(String[] args) {
        System.out.println("Enter the weight in kg:");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        System.out.println("Enter the height in cm:");
        double height = in.nextDouble();
        height = height / 100.0;
        double BMI = weight / (Math.pow(height, 2));
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println();
        System.out.println("The BMI is:");
        System.out.println(BMI);
        in.close();
    }
}