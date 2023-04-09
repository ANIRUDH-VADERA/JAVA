package activity2;

import java.util.Scanner;

class q5 {

    static float addition(float a, float b) {
        float result = 0;
        result = a + b;
        return result;
    }

    static float subtraction(float a, float b) {
        float result = 0;
        result = a - b;
        return result;
    }

    static float multiplication(float a, float b) {
        float result = 0;
        result = a * b;
        return result;
    }

    static float division(float a, float b) {
        float result = 0;
        result = a / b;
        return result;
    }

    public static void main(String[] args) {
        float num1, num2, result;
        Scanner scanner = new Scanner(System.in);
        int flag;
        System.out.println("ANIRUDH VADERA(20BCE2940)");

        do {
            System.out.println("Press 1 for : Addition");
            System.out.println("Press 2 for : Subtraction");
            System.out.println("Press 3 for : Multiplication");
            System.out.println("Press 4 for : Division");
            System.out.println("Press 5 for : Exit");
            System.out.print("Enter the number 1 for calculation : ");
            num1 = scanner.nextFloat();
            System.out.print("Enter the number 2 for calculation : ");
            num2 = scanner.nextFloat();
            flag = scanner.nextInt();
            System.out.println("ANIRUDH VADERA(20BCE2940)");
            if (flag == 1) {
                result = addition(num1, num2);
                System.out.println("The result is : " + result);
            }
            if (flag == 2) {
                result = subtraction(num1, num2);
                System.out.println("The result is : " + result);
            }
            if (flag == 3) {
                result = multiplication(num1, num2);
                System.out.println("The result is : " + result);
            }
            if (flag == 4) {
                result = division(num1, num2);
                System.out.println("The result is : " + result);
            }
        } while (flag != 5);
        scanner.close();

    }
}
