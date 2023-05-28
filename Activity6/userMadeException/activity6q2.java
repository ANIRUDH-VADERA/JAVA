package activity6;

import java.util.Scanner;

class invalidMarks extends Exception {
    public invalidMarks(String message) {
        super(message);
    }
}

public class activity6q2 {

    static void validate(int mark) throws invalidMarks {
        if (mark < 0 || mark > 100) {
            throw new invalidMarks("The Marks Should be between 0 and 100");
        }
    }

    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println("Enter the number of students : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter Marks : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Marks for Student : " + (i + 1));
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            try {
                validate(array[i]);
            } catch (invalidMarks e) {
                e.printStackTrace();
                System.out.println("exception Caught");
                System.out.println("Exception occured for student " + (i + 1) + " : " + e);
                System.out.println("Enter marks for student " + (i + 1) + " Again ");
                array[i] = in.nextInt();
            }
        }
        System.out.println("After Correcting the Marks : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Marks for Student : " + (i + 1) + " : " + array[i]);
        }
        in.close();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
    }

}
