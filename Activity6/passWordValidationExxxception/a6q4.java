package activity6;

import java.util.Scanner;

class invalid extends Exception {
    public invalid(String message) {
        super(message);
    }
}

public class a6q4 {

    static void validate(String userName, String password, String confirmPassword, int flag) throws invalid {

        switch (flag) {
            case 1:
                if (userName.length() < 8 || password.length() < 8) {
                    throw new invalid("Invalid UserName Lnegth or Invalid Password Lnegth");
                }
                break;
            case 2:
                if (userName.contains(" ") || password.contains(" ")) {
                    throw new invalid("UserName or Password should not contain space.");
                }
                break;
            case 3:
                if (!(password.equals(confirmPassword))) {

                    throw new invalid("Passwords dont match : ");
                }
                break;
            case 4:
                String temp = new String();
                for (int i = 0; i < (userName.length() - 2); i++) {
                    temp = "";
                    temp = temp.concat(userName.substring(i, i + 3));
                    if (password.contains(temp)) {

                        throw new invalid("Passwords cannot contain userName : ");
                    }
                }
                break;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the UserName : ");
        String userName = in.nextLine();
        System.out.println("Enter the Password : ");
        String password = in.nextLine();
        System.out.println("Confirm your Password : ");
        String confirmPassword = in.nextLine();

        try {
            validate(userName, password, confirmPassword, 1);
            validate(userName, password, confirmPassword, 2);
            validate(userName, password, confirmPassword, 3);
            validate(userName, password, confirmPassword, 4);
        } catch (invalid e) {
            e.printStackTrace();
            System.out.println("Exception Caught :");
        }
        in.close();
    }
}
