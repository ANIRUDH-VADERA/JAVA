package activity5;

import java.util.Scanner;

public class activity5q3 {
    class School {
        Department[] department_array;

        School(Department[] department_array) {
            this.department_array = department_array;
        }

        class Department {
            String name;
            int id;
            int no_of_children;

            Department(String name, int id, int no_of_children) {
                this.name = name;
                this.id = id;
                this.no_of_children = no_of_children;
            }
        }

        void display() {
            for (int i = 0; i < department_array.length; i++) {
                System.out.println("Department : " + (i + 1));
                System.out.println("Department Name : " + department_array[i].name);
                System.out.println("Department ID : " + department_array[i].id);
                System.out.println("Department Students : " + department_array[i].no_of_children);
            }
        }

    }

    public static void main(String[] args) {
        activity5q3 main = new activity5q3();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the department : ");
        int n = in.nextInt();
        if (n > 3) {
            System.out.println("The number of the departments should be less than 4 : ");
        } else {
            School.Department[] dep = new School.Department[n];
            School obj = main.new School(dep);
            for (int i = 0; i < dep.length; i++) {
                dep[i] = obj.new Department(("Name" + i), (i), (i + 10));
            }
            System.out.println("ANIRUDH VADERA (20BCE2940)");
            obj.display();
        }
        in.close();
    }

}
