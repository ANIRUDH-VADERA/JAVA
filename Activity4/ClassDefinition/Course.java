package activity4;

import java.util.Scanner;

public class Course {
    String CourseName;
    int CourseId;
    String Coursetype;
    String School;
    static int count_UE;
    static int count_PE;
    static int count_PC;

    void set_courseDetails(String CourseName, int CourseId, String Coursetype, String School) {
        this.CourseName = CourseName;
        this.CourseId = CourseId;
        this.Coursetype = Coursetype;
        this.School = School;
    }

    static void search_courseDetails(Course[] courseArray) {
        for (int i = 0; i < courseArray.length; i++) {
            switch (courseArray[i].Coursetype) {
                case "UE":
                    Course.count_UE++;
                    break;
                case "PE":
                    Course.count_PE++;
                    break;
                case "PC":
                    Course.count_PC++;
                    break;
            }
        }
    }

    static void display_courseDetails(Course[] courseArray) {
        System.out.println("The Counts are as Follows : ");
        System.out.println("Number of UE Courses : " + Course.count_UE);
        System.out.println("Number of PE Courses : " + Course.count_PE);
        System.out.println("Number of PC Courses : " + Course.count_PC);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Courses : ");
        n = in.nextInt();
        Course[] array_object = new Course[n];
        System.out.println("Enter the Course Details: ");
        in.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Course : " + (i + 1));
            System.out.print("Course Name : ");
            String CourseName = in.nextLine();
            System.out.print("Course ID : ");
            int CourseId = in.nextInt();
            in.nextLine();
            System.out.print("Course Type : ");
            String Coursetype = in.nextLine();
            System.out.print("School : ");
            String School = in.nextLine();
            array_object[i] = new Course();
            array_object[i].set_courseDetails(CourseName, CourseId, Coursetype, School);
        }
        Course.search_courseDetails(array_object);
        System.out.println("After Searching for the UE,PE,PC courses the results are : ");
        Course.display_courseDetails(array_object);
        in.close();
    }

}
