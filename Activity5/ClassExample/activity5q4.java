package activity5;

import java.util.Scanner;

class Faculty {
    String Name;
    int empid;

    Faculty(String Name, int empid) {
        this.Name = Name;
        this.empid = empid;
    }

    public void display() {
        System.out.println("Faculty Name : " + Name);
        System.out.println("Faculty ID : " + empid);
    }

    static class Eligible_Leave {
        static int EL = 12;
        static int ML = 20;
        static int CL = 10;

        static void display_leave_categories() {
            System.out.println("EL : " + EL);
            System.out.println("ML : " + ML);
            System.out.println("CL : " + CL);
        }
    }
}

public class activity5q4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Faculty : ");
        n = in.nextInt();
        Faculty[] faculty = new Faculty[n];
        for (int i = 0; i < faculty.length; i++) {
            System.out.println("Enter the details of Faculty : " + (i + 1));
            in.nextLine();
            System.out.print("Faculty Name : ");
            String Name = in.nextLine();
            System.out.print("Faculty ID : ");
            int empid = in.nextInt();
            faculty[i] = new Faculty(Name, empid);
        }
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println("The Faculty Details are as Follows : ");
        for (int i = 0; i < faculty.length; i++) {
            System.out.println("Details of Faculty : " + (i + 1));
            faculty[i].display();
        }
        System.out.println("The Eligible Leave for all faculty are : ");
        Faculty.Eligible_Leave.display_leave_categories();
        in.close();
    }
}
