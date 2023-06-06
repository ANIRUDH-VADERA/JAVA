package activity7;

class Array {
    static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static synchronized void print(String odd_even) {
        if (odd_even.equals("ODD")) {
            System.out.println("Printing Odd Numbers");
            System.out.print("[ ");
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("Printing Even Numbers");
            System.out.print("[ ");
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println("]");
        }
    }

}

public class activity7q1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 - ODD");
            System.out.println(Thread.currentThread().getName());
            Array.print("ODD");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 - EVEN");
            System.out.println(Thread.currentThread().getName());
            Array.print("EVEN");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread 2 - MAIN");
        System.out.println(Thread.currentThread().getName());
    }
}
