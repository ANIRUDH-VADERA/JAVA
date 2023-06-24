package activity10;

import java.util.ArrayList;
import java.util.Comparator;

public class activity10q1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        list.add("Volkswagen");
        list.add("Toyota");
        list.add("Porsche");
        list.add("Ferrari");
        list.add("Mercedes-Benz");
        list.add("Audi");
        list.add("Rolls-Royce");
        list.add("BMW");
        list.add("E_Coe");
        System.out.println("Before Sorting: " + list);
        list.sort((p1, p2) -> p1.length() - p2.length());
        System.out.println("After Sorting(Length): " + list);
        list.sort((p1, p2) -> p2.length() - p1.length());
        System.out.println("After Sorting(Reverse Length): " + list);
        list.sort((str1, str2) -> str1.charAt(0) - str2.charAt(0));
        System.out.println("After Sorting(First Character): " + list);
        list.sort(Comparator.comparingInt(a -> (a.startsWith("E") || a.startsWith("E") ? 0 : 1)));
        System.out.println("After Sorting(First e): " + list);
    }
}
