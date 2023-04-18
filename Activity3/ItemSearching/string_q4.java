package activity3;

import java.util.Scanner;

class string_q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the sentence :");
        str = in.nextLine();
        String[] split_array = str.split(" ");
        int count = 0;
        for (String data : split_array) {
            if (data.matches("VIT")) {
                count++;
            }
        }
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        if (count == 0) {
            System.out.println("No Such word in the Sentence : ");
        }
        System.out.println("The number of times VIT is in the string is : " + count);
        in.close();
    }
}