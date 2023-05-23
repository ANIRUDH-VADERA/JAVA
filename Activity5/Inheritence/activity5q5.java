package activity5;

import java.util.Scanner;

abstract class Shape {
    abstract void compute_volume();
}

class Sphere extends Shape {
    int r;
    double volume;

    Sphere(int r) {
        this.r = r;
        volume = (4 / 3) * Math.PI * r * r * r;
    }

    void compute_volume() {
        System.out.println("The Volume of Sphere is : ");
        System.out.println(volume);
    }
}

class Cylinder extends Shape {
    int r;
    int h;
    double volume;

    Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
        volume = Math.PI * r * r * h;
    }

    void compute_volume() {
        System.out.println("The Volume of Cylinder is : ");
        System.out.println(volume);
    }
}

class Cube extends Shape {
    int a;
    double volume;

    Cube(int a) {
        this.a = a;
        volume = a * a * a;
    }

    void compute_volume() {
        System.out.println("The Volume of Cube is : ");
        System.out.println(volume);
    }
}

public class activity5q5 {

    public static void display(Shape x) {
        System.out.println("The Result is : ");
        x.compute_volume();
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of Shapes : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Shape[] shapes = new Shape[n];
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Enter the Shape type : ");
            System.out.println("1 : Sphere");
            System.out.println("2 : Cylinder");
            System.out.println("3 : Cube");
            int x = in.nextInt();
            if (x == 1) {
                System.out.print("Enter the radius of Sphere : ");
                int r = in.nextInt();
                System.out.println();
                shapes[i] = new Sphere(r);
            } else if (x == 2) {
                System.out.print("Enter the radius of Cylinder : ");
                int r = in.nextInt();
                System.out.print("Enter the height of Cylinder : ");
                int h = in.nextInt();
                System.out.println();
                shapes[i] = new Cylinder(r, h);
            } else {
                System.out.print("Enter the side of Cube : ");
                int a = in.nextInt();
                System.out.println();
                shapes[i] = new Cube(a);
            }
        }
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        for (int i = 0; i < shapes.length; i++) {
            display(shapes[i]);
        }
        in.close();
    }
}
