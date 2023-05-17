package activity4;

import java.util.Scanner;

interface CourseTotal {
    int Total();
}

interface CourseAverage {
    String Average(int total);
}

public class Result implements CourseTotal, CourseAverage {

    int marks1;
    int marks2;
    int marks3;

    Scanner in = new Scanner(System.in);

    public int Total() {
        System.out.println("Enter the marks : ");
        System.out.print("Marks1 : ");
        marks1 = in.nextInt();

        System.out.print("Marks2 : ");
        marks2 = in.nextInt();

        System.out.print("Marks3 : ");
        marks3 = in.nextInt();

        return (marks1 + marks2 + marks3);
    }

    public String Average(int total) {
        float average = total / 3;
        if (average >= 60) {
            return ("First");
        } else if (average >= 50) {
            return ("Second");
        } else {
            return ("Fail");
        }
    }

    public static void main(String[] args) {
        Result obj = new Result();
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println();
        int total = obj.Total();
        System.out.println(obj.Average(total));
    }
}