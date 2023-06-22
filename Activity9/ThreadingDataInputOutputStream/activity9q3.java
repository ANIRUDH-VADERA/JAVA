package activity9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteThread implements Runnable {

    String filePath;
    int flag = 0;
    DataOutputStream dout = null;
    int start;
    int end;
    int file;

    WriteThread(String filePath, int start, int end, int file) {
        this.filePath = filePath;
        this.start = start;
        this.end = end;
        this.file = file;
    }

    public void run() {

        synchronized (WriteThread.class) {
            try {
                dout = new DataOutputStream(new FileOutputStream(filePath));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (int i = start; i < end; i++) {
                flag = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    if (i != 1) {
                        try {
                            dout.writeInt(i);
                            dout.flush();
                            System.out.println("Waiting 1 sec after writing......prime : " + i);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                System.out.println(e);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            try {
                dout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (file == 1) {
                System.out.println("Successfully written prime numebrs from 1 to 100 in file1...");

            } else {
                System.out.println("Successfully written prime numebrs from 101 to 201 in file2...");
            }
        }
    }
}

class ReadThread implements Runnable {

    String filePath;
    DataInputStream din = null;
    int primes[] = new int[100];
    int end = 0;
    int i;
    int file; // 1 - file1 2 - file2

    ReadThread(String filePath, int file) {
        this.filePath = filePath;
        this.file = file;
    }

    public void run() {
        // Waiting for Write operations to complete before reading

        synchronized (ReadThread.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            try {
                din = new DataInputStream(new FileInputStream(filePath));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                while ((din.available() > 0)) {
                    i = din.readInt();
                    primes[end++] = i;
                }
                din.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (file == 1) {
                System.out.println("The Primes are (From File1) : ");
                System.out.print("[ ");
                for (int i = 0; i < end; i++) {
                    System.out.print(primes[i] + " ");
                }
                System.out.println("]");
            } else {
                System.out.println("The Primes are (From File2) : ");
                System.out.print("[ ");
                for (int i = 0; i < end; i++) {
                    System.out.print(primes[i] + " ");
                }
                System.out.println("]");
            }
        }
    }
}

public class activity9q3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        WriteThread writeFile1 = new WriteThread(
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q3file1.txt", 1, 101, 1);
        Thread t1 = new Thread(writeFile1);

        WriteThread writeFile2 = new WriteThread(
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q3file2.txt", 101, 201, 2);
        Thread t2 = new Thread(writeFile2);

        ReadThread readFile1 = new ReadThread(
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q3file1.txt", 1);
        Thread t3 = new Thread(readFile1);
        ReadThread readFile2 = new ReadThread(
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q3file2.txt", 2);
        Thread t4 = new Thread(readFile2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t4.start();
        t3.join();
        t4.join();
    }
}
