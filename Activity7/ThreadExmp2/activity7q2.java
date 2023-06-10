package activity7;

import java.util.Scanner;

class invalidInputNotRange1 extends Exception {
    public invalidInputNotRange1(String message) {
        super(message);
    }
}

class invalidInputNotRange2 extends Exception {
    public invalidInputNotRange2(String message) {
        super(message);
    }
}

class Thread1 implements Runnable {
    int[] number;
    int range1_low;
    int range1_high;
    int sum = 0;
    int[] array_factor = new int[100];
    int factor_elements = 0;
    int[] unique = new int[100];
    int unique_elements = 0;
    int start;
    int end;

    Thread1(int[] number, int start, int end, int range1_low, int range1_high) {
        this.number = number;
        this.range1_high = range1_high;
        this.range1_low = range1_low;
        this.start = start;
        this.end = end;
    }

    void validate1(int input) throws invalidInputNotRange1 {
        if (input >= range1_low && input <= range1_high) {

        } else {
            throw new invalidInputNotRange1(
                    "The Input (" + input + ") is not in the Specified Range of " + "[" +
                            range1_low + "," +
                            range1_high + "]");
        }
    }

    public void generate() {
        for (int number = range1_low; number < (range1_high + 1); number++) {
            sum = 0;
            int temp = number;
            while (temp != 0) {
                int c = temp % 10;
                sum = sum + c;
                temp = temp / 10;
            }
            if (number % sum == 0) {
                array_factor[factor_elements++] = number;
            }
        }
    }

    public void run() {
        generate();
        System.out.println("Thread 1 - Numbers whose sum of digits is a factor ofnumber itself");
        for (int j = start; j < end; j++) {
            try {
                validate1(number[j]);
                int flag = 0;
                for (int i = 0; i < factor_elements; i++) {
                    if (number[j] == array_factor[i]) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    unique[unique_elements++] = number[j];
                }
            } catch (invalidInputNotRange1 e) {
                System.out.println(e);
            }
        }
        print();
    }

    public void print() {
        System.out.println("The Numbers that satisfies the conditions are : ");
        System.out.println("Printing Numbers whose sum of digits is a factor ofnumber itself");
        System.out.print("[ ");
        for (int i = 0; i < unique_elements; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println("]");
    }

}

class Thread2 implements Runnable {
    int[] number;
    int range2_low;
    int range2_high;
    int sum = 0;
    int[] array_factor = new int[100];
    int factor_elements = 0;
    int[] unique = new int[100];
    int unique_elements = 0;
    int start;
    int end;

    Thread2(int[] number, int start, int end, int range2_low, int range2_high) {
        this.number = number;
        this.range2_high = range2_high;
        this.range2_low = range2_low;
        this.start = start;
        this.end = end;
    }

    void validate2(int input) throws invalidInputNotRange2 {
        if (input >= range2_low && input <= range2_high) {

        } else {
            throw new invalidInputNotRange2(
                    "The Input (" + input + ") is not in the Specified Range of " + "[" + range2_low + "," + range2_high
                            + "]");
        }
    }

    public void generate() {
        for (int number = range2_low; number < (range2_high + 1); number++) {
            sum = 0;
            int temp = number;
            while (temp != 0) {
                int c = temp % 10;
                sum = sum + c;
                temp = temp / 10;
            }
            int flag = 0;
            for (int i = 2; i < sum; i++) {
                if (sum % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                array_factor[factor_elements++] = number;
            }
        }
    }

    public void run() {
        generate();
        System.out.println("Thread 2 - Numbers whose sum of digits is a PrimeNumber");
        for (int j = start; j < end; j++) {
            try {
                validate2(number[j]);
                int flag = 0;
                for (int i = 0; i < factor_elements; i++) {
                    if (number[j] == array_factor[i]) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    unique[unique_elements++] = number[j];
                }
            } catch (invalidInputNotRange2 e) {
                System.out.println(e);
            }
        }
        print();
    }

    public void print() {
        System.out.println("The Numbers that satisfies the conditions are : ");
        System.out.println("Printing Numbers whose sum of digits is a Prime Number");
        System.out.print("[ ");
        for (int i = 0; i < unique_elements; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println("]");
    }
}

public class activity7q2 {

    static int range1_low;
    static int range1_high;
    static int range2_low;
    static int range2_high;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ANIRUDH VADERA(20BCE2940)");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range1_low : ");
        activity7q2.range1_low = in.nextInt();
        System.out.println("Enter the range1_high : ");
        activity7q2.range1_high = in.nextInt();
        System.out.println("Enter the range2_low : ");
        activity7q2.range2_low = in.nextInt();
        System.out.println("Enter the range2_high : ");
        activity7q2.range2_high = in.nextInt();
        System.out.println("Enter The set of Number Strings to be checked(Inmultiples of 10) : ");
        int n = in.nextInt();
        n = n * 10;
        int[] set = new int[n];
        for (int i = 0; i < (n); i++) {
            set[i] = (i + 1) * 10;
        }

        for (int i = 0; i < n / 10; i++) {
            int start = (i * 10);
            int end = (i * 10) + 10;
            Thread1 factor = new Thread1(set, start, end, range1_low, range1_high);
            Thread t1 = new Thread(factor);
            Thread2 prime = new Thread2(set, start, end, activity7q2.range2_low,
                    range2_high);
            Thread t2 = new Thread(prime);
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }
        System.out.println("Thread 2 - MAIN");
        System.out.println(Thread.currentThread().getName());
        in.close();
    }
}
