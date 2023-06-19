package activity9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class activity9q1 {
    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        String Content = new String("");
        int i;
        int[] Content_in_integer = new int[10000];
        int end = 0;

        // Reading the initial Content

        try {
            FileInputStream fin = new FileInputStream(
                    "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q1.txt");
            while ((i = fin.read()) != -1) {
                Content_in_integer[end++] = i;
                Content = Content + ((char) i);
            }
            System.out.println("The Contents of the File is : " + Content);
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Writing the reversed Content in the file

        try {
            FileOutputStream fout = new FileOutputStream(
                    "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q1.txt");
            for (int j = (end - 1); j >= 0; j--) {
                fout.write(Content_in_integer[j]);
            }
            fout.close();
            System.out.println("Success... Written the reversed Content : ");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Reading the Final Content

        try {
            FileInputStream fin = new FileInputStream(
                    "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q1.txt");
            Content = "";
            end = 0;
            while ((i = fin.read()) != -1) {
                Content_in_integer[end++] = i;
                Content = Content + ((char) i);
            }
            System.out.println("The Contents of the File after reversing is : " + Content);
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
