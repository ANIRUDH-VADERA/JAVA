package activity2;

import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        int maths, phy, chem, eng, cse;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks for Maths : ");
        maths = scanner.nextInt();
        System.out.print("Enter the marks for Physics : ");
        phy = scanner.nextInt();
        System.out.print("Enter the marks for Chemistry : ");
        chem = scanner.nextInt();
        System.out.print("Enter the marks for English : ");
        eng = scanner.nextInt();
        System.out.print("Enter the marks for Computer Science : ");
        cse = scanner.nextInt();

        float O_average, E_average, CS_average;
        O_average = (maths + phy + chem + eng + cse) / 5;
        E_average = ((maths * 2) + phy + chem) / 4;
        CS_average = cse;
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        if (O_average > 75 & E_average > CS_average) {
            System.out.println("Given Current Marks Student is a Probable Mech, Civil, EEE, ECE candidate");
        }
        if (O_average > 75 & E_average <= CS_average) {
            System.out.println("Given Current Marks Student is a Probable CSE, IT, IS candidate");
        }
        if (O_average < 75 & E_average < CS_average) {
            System.out.println("Given Current Marks Student is a Probable BCA candidate");
        }
        if (O_average < 75 & E_average > CS_average) {
            System.out.println("Given Current Marks Student is a Probable BSc candidate");
        }
        scanner.close();
    }
}
