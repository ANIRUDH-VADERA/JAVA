package activity4;

import java.util.Scanner;

public class Participants {
    String Name;
    int Phno;
    String Branch;
    String University;
    static String[] TestResultClassification;

    Participants(String Name, int Phno, String Branch, String University) {
        this.Name = Name;
        this.Phno = Phno;
        this.Branch = Branch;
        this.University = University;
    }

    static void display(Participants[] Participant_array) {
        for (int i = 0; i < TestResultClassification.length; i++) {
            System.out.println("The result of student " + Participant_array[i].Name + " is : ");
            switch (TestResultClassification[i]) {
                case "L1":
                    System.out.println("Congratulations You have been selected for both Internship and Full Time Job");
                    break;
                case "L2":
                    System.out.println(
                            "You have been selected for Internship and based on the performance in Internship program you will be offered Full Time Job");
                    break;
                case "L3":
                    System.out.println(
                            "You have been selected for Internship and based on the performance in Internship program you will be offered Full Time Job");
                    break;
                case "L4":
                    System.out.println("You have been selected for Part Time Internship for 21 days");
                    break;
                case "L5":
                    System.out.println("You have been selected for Part Time Internship for 21 days");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Participants : ");
        n = in.nextInt();
        Participants[] array_object = new Participants[n];
        System.out.println("Enter the Participants Details: ");
        in.nextLine();
        String[] TestResultClassification = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Participant : " + (i + 1));
            System.out.print("Name : ");
            String Name = in.nextLine();
            System.out.print("Phno : ");
            int Phno = in.nextInt();
            in.nextLine();
            System.out.print("Branch : ");
            String Branch = in.nextLine();
            System.out.print("University : ");
            String University = in.nextLine();
            System.out.print("TestResultClassification : ");
            TestResultClassification[i] = in.nextLine();
            array_object[i] = new Participants(Name, Phno, Branch, University);
        }
        Participants.TestResultClassification = TestResultClassification;
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        Participants.display(array_object);
        in.close();
    }

}
