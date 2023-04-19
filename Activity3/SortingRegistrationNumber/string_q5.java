package activity3;

import java.util.Scanner;

class string_q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of register numbers to be used :");
        int n = in.nextInt();
        String[] array_reg_no = new String[n];
        in.nextLine();
        System.out.println("Enter the register numbers : ");
        for (int i = 0; i < array_reg_no.length; i++) {
            array_reg_no[i] = in.nextLine();
        }
        System.out.println("The register numbers are : ");
        System.out.print("[ ");
        for (String data : array_reg_no) {
            System.out.print(data + " ");
        }
        System.out.println("]");
        int flag = 0;
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        for (String data : array_reg_no) {
            if (data.contains("BCE")) {
                flag = 1;
                System.out.println(data + ": This Register Number is for SCOPE School");
            } else if (data.contains("BEC")) {
                flag = 2;
                System.out.println(data + ": This Register Number is for SENSE School");
            } else {
                System.out.println(data + ": This Register Number is not from SCOPE either SENSE School");
            }
        }
        if (flag == 0) {
            System.out.println("There are no students from SCOPE and SENSE School");
        }
        in.close();
    }
}