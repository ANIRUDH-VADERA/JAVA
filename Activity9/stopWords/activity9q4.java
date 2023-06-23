package activity9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class readFile implements Runnable {

    int type;
    String filePath;

    readFile(int type, String filePath) {
        this.type = type;
        this.filePath = filePath;
    }

    public void run() {
        synchronized (readFile.class) {
            File file = new File(filePath);
            Scanner in = null;
            try {
                in = new Scanner(file);
                in.useDelimiter(" ");
                if (type == 1) {
                    String[] stop = { "a", "and", "the" };
                    int[] times = new int[3];
                    while (in.hasNext()) {
                        String word = in.next();
                        if (word.equals(stop[0])) {
                            times[0] = times[0] + 1;
                        }
                        if (word.equals(stop[1])) {
                            times[1] = times[1] + 1;
                        }
                        if (word.equals(stop[2])) {
                            times[2] = times[2] + 1;
                        }
                    }

                    System.out.println("Displaying the Number of Stop Words : ");
                    for (int i = 0; i < stop.length; i++) {
                        System.out.println("Stop Word : " + stop[i] + " :: Number of times appeared : " + times[i]);
                    }

                } else {
                    String[] stop = { "a", "and", "the" };
                    int times = 0;
                    while (in.hasNext()) {
                        String word = in.next();
                        if (word.equals(stop[0]) || word.equals(stop[1]) || word.equals(stop[2])) {
                        } else {
                            if (word.startsWith("H")) {
                                times++;
                            }
                        }
                    }
                    System.out.println("Number of times Non Stop words starting with 'H' Appeared : " + times);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                in.close();
            }
        }
    }
}

public class activity9q4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        readFile readThread1 = new readFile(1,
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q4file1.txt");
        Thread t1 = new Thread(readThread1);
        readFile readThread2 = new readFile(2,
                "C:/Users/Anirudh/OneDrive/Desktop/java_codes/activity9/activity9q4file2.txt");
        Thread t2 = new Thread(readThread2);
        Thread t3 = new Thread(() -> {
            System.out.println("Waiting for Thread 1 and 2 to complete ....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thank you for using our Software ...");
        });

        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
