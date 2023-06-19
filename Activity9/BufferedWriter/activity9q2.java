package activity9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class activity9q2 {
    public static void main(String[] args) {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        try (FileWriter writer = new FileWriter(
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q2.txt")) {
            BufferedWriter buffer = new BufferedWriter(writer);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String towrite = reader.readLine();
            buffer.write(towrite);
            System.out.println("Succes in writing the alphabets...");
            buffer.flush();
            buffer.close();
        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }
}
