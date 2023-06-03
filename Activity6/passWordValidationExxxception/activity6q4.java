package activity6;

import java.util.Scanner;

class invalidInput extends Exception {
    public invalidInput(String message) {
        super(message);
    }
}

public class activity6q4 {

    static int check = 0;

    static void validate(String userName, String password, String confirmPassword, int flag) throws invalidInput {

        switch (flag) {
            case 1:
                if (userName.length() < 8 || password.length() < 8) {
                    check = 0;
                    throw new invalidInput("Invalid UserName Lnegth or Invalid Password Lnegth");
                }
                break;
            case 2:
                if (userName.contains(" ") || password.contains(" ")) {
                    check = 0;
                    throw new invalidInput("UserName or Password should not contain space.");
                }
                break;
            case 3:
                if (!(password.equals(confirmPassword))) {
                    check = 0;
                    throw new invalidInput("Passwords dont match : ");
                }
                break;
            case 4:
                String temp = new String();
                for (int i = 0; i < (userName.length() - 2); i++) {
                    temp = "";
                    temp = temp.concat(userName.substring(i, i + 3));
                    if (password.contains(temp)) {
                        check = 0;
                        throw new invalidInput("Passwords cannot contain userName : ");
                    }
                }
                break;
        }
        check = 1;

    }

    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the UserName : ");
        String userName = in.nextLine();
        System.out.println("Enter the Password : ");
        String password = in.nextLine();
        System.out.println("Confirm your Password : ");
        String confirmPassword = in.nextLine();

        int iterator = 1;

        while (check == 0) {
            try {
                validate(userName, password, confirmPassword, iterator);
                iterator++;
                validate(userName, password, confirmPassword, iterator);
                iterator++;
                validate(userName, password, confirmPassword, iterator);
                iterator++;
                validate(userName, password, confirmPassword, iterator);
            } catch (invalidInput e) {
                e.printStackTrace();
                System.out.println("Exception Caught :");
                if (iterator == 1) {
                    System.out.println("Enter Your UserName and Password again : ");
                    System.out.print("UserName : ");
                    userName = in.nextLine();
                    System.out.println();
                    System.out.print("Password : ");
                    password = in.nextLine();
                }
                if (iterator == 2) {
                    System.out.println("Enter Your UserName and Password again : ");
                    System.out.print("UserName : ");
                    userName = in.nextLine();
                    System.out.println();
                    System.out.print("Password : ");
                    password = in.nextLine();
                }
                if (iterator == 3) {
                    System.out.println("Enter Your Passwords again : ");
                    System.out.print("Password : ");
                    password = in.nextLine();
                    System.out.println();
                    System.out.print("Confirm Password : ");
                    confirmPassword = in.nextLine();
                }
                if (iterator == 4) {
                    System.out.println("Enter Your UserName and Password again : ");
                    System.out.print("UserName : ");
                    userName = in.nextLine();
                    System.out.println();
                    System.out.print("Password : ");
                    password = in.nextLine();
                }
            }

        }
        System.out.println("Everything is verified and correct");
        in.close();
    }
}
