package activity10;

import java.util.*;

public class activity10q4 {
    Map<String, List<String>> h1 = new HashMap<>();
    Map<String, String> h2 = new HashMap<>();

    int n, m;

    void insert_to_studentList(String student, String course) {
        if (h1.containsKey(student)) {
            List<String> courses = new ArrayList<>(h1.get(student));
            courses.add(course);
            h1.put(student, courses);
        } else {
            List<String> courseTemp = new ArrayList<>();
            courseTemp.add(course);
            h1.put(student, courseTemp);
        }
    }

    void removeStudent(String student) {
        if (h1.containsKey(student))
            h1.remove(student);
    }

    void showMaps() {
        System.out.println("Student Name\tCourses");
        Set<Map.Entry<String, List<String>>> keySet = h1.entrySet();
        for (Map.Entry<String, List<String>> set : keySet)
            System.out.println(set.getKey() + "\t" + set.getValue());

        System.out.println("Courses\tTeachers");
        Set<Map.Entry<String, String>> newSet = h2.entrySet();
        for (Map.Entry<String, String> set : newSet)
            System.out.println(set.getKey() + "\t" + set.getValue());

    }

    void showFaculty(String student) {
        System.out.println("Teachers for " + student);
        if (h1.containsKey(student))
            for (String course : h1.get(student))
                System.out.print(h2.get(course) + "\t");
    }

    public static void main(String[] args) {
        activity10q4 q = new activity10q4();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        q.n = sc.nextInt();

        System.out.println("Enter m : ");
        q.m = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter student details");
        for (int i = 0; i < q.n; i++) {
            System.out.println("Enter student name : ");
            String name = sc.nextLine();
            System.out.println("Enter " + name + "'s courses : (Press e to stop)");
            while (true) {
                String course = sc.nextLine();
                if (course.length() == 1 && course.charAt(0) == 'e')
                    break;
                q.insert_to_studentList(name, course);
            }
        }

        System.out.println("Enter faculty details");
        for (int i = 0; i < q.m; i++) {
            System.out.println("Enter course name : ");
            String name = sc.nextLine();
            System.out.println("Enter " + name + " faculty name : ");
            q.h2.put(name, sc.nextLine());
        }

        q.showMaps();
        System.out.println("Enter the student name whom you want to add : ");
        String name_add = sc.nextLine();
        System.out.println("Enter " + name_add + "'s courses : (Press e to stop)");
        while (true) {
            String course = sc.nextLine();
            if (course.length() == 1 && course.charAt(0) == 'e')
                break;
            q.insert_to_studentList(name_add, course);
        }
        q.showMaps();
        System.out.println("Enter the student name whom you want to remove : ");
        String name_remove = sc.nextLine();
        q.removeStudent(name_remove);
        q.showMaps();
        System.out.println("Enter the student name whose faculty names you want to view : ");
        String name = sc.nextLine();
        q.showFaculty(name);
        System.out.println();
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        sc.close();
    }
}