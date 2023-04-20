package activity3;

import java.util.Scanner;
import java.math.BigInteger;

class string_q6 {

    static int StrToBinary(String s) {
        int n = s.length();
        int length = 0;
        for (int i = 0; i < n; i++) {
            int val = Integer.valueOf(s.charAt(i));
            // Convert ASCII value to binary
            String bin = "";
            while (val > 0) {
                if (val % 2 == 1) {
                    bin += '1';
                } else
                    bin += '0';
                val /= 2;
            }
            length = bin.length();
            bin = reverse(bin);
            System.out.print(bin + " ");
        }
        return length;
    }

    static String reverse(String input) {
        char[] a = input.toCharArray();
        int r = 0;
        r = a.length - 1;
        for (int l = 0; l < r; l++, r--) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }

    static String StrtoHex(String str) {
        String hex = new String("");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int in = (int) ch;
            String part = Integer.toHexString(in);
            hex += part;
        }
        return hex;
    }

    static String HexToBinary(String s) {
        return new BigInteger(s, 16).toString(2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string to be converted : ");
        str = in.nextLine();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        // Method to convert a string into binary:
        System.out.println("The Binary Equivalent of the string is : ");
        int one_length = StrToBinary(str);
        // Method to convert a string into hexadecimal:
        String hex = StrtoHex(str);
        String Main_Hex = new String();
        int temp = 0;
        for (int i = 0; i < hex.length(); i++) {
            temp++;
            if (temp == 3) {
                Main_Hex += " " + hex.charAt(i);
                temp = 1;
            } else {
                Main_Hex += hex.charAt(i);
            }
        }
        System.out.println();
        System.out.println("The Hexadecimal equivalent of the string is : ");
        System.out.println(Main_Hex);
        String HextoBinary = HexToBinary(hex);
        String Main_Bin = new String();
        temp = 0;
        for (int i = 0; i < HextoBinary.length(); i++) {
            temp++;
            if ((temp - 1) == one_length) {
                Main_Bin += " ";
                temp = 0;
            } else {
                Main_Bin += HextoBinary.charAt(i);
            }
        }
        System.out.println("The Binary equivalent of the Hexadecimal String is : ");
        System.out.println(Main_Bin);
        in.close();
    }
}