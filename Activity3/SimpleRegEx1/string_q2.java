package activity3;

import java.util.Scanner;

class string_q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Register Number of the Student :");
        String reg_no = new String();
        reg_no = in.nextLine();
        System.out.println("Enter the Mobile Number of the Student :");
        String ph_no = new String();
        ph_no = in.nextLine();
        if ((reg_no.length() != 9)) {
            System.out.println("Error : Entered reg_no doesnt contain 9 digits : Enter again");
            reg_no = in.nextLine();
        } else if ((ph_no.length() != 10)) {
            System.out.println("Error : Entered ph_no doesnt contain 10 digits : Enter again");
            ph_no = in.nextLine();
        }
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        if (reg_no.matches("[a-zA-Z0-9]+") == false) {
            System.out.println("Invalid : The reg_no contain characters other than numbers and alphabets");
        } else if (ph_no.matches("[0-9]+") == false) {
            System.out.println("Invalid : The ph_no contain characters other than numbers");
        } else {
            System.out.println("Valid");
        }
        in.close();
    }
}
