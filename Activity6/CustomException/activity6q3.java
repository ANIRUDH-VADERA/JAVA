package activity6;

import java.util.Scanner;

class invalidInputLess0 extends Exception {
    public invalidInputLess0(String message) {
        super(message);
    }
}

class invalidInputNotRange extends Exception {
    public invalidInputNotRange(String message) {
        super(message);
    }
}

public class activity6q3 {

    static void validate(int input) throws invalidInputLess0, invalidInputNotRange {
        if (input <= 0) {
            throw new invalidInputLess0("The Input is equal to 0 or Negative");
        }
        if (input > 50 && input < 100) {
            throw new invalidInputNotRange("The Input cannot be in the range 50 to 100");
        }
    }

    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println("Enter the Input : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try {
            try {
                validate(n);
            } catch (invalidInputNotRange e) {
                e.printStackTrace();
                System.out.println("Exception Caught :");
                System.out.println("Exception occured for the Input : ");
            }
        } catch (invalidInputLess0 e) {
            e.printStackTrace();
            System.out.println("Exception Caught :");
            System.out.println("Exception occured for the Input : ");
        } finally {
            System.out.println("Inside the finally block performing the cleanup and closing the Scanner object :");
            in.close();
        }
    }
}
