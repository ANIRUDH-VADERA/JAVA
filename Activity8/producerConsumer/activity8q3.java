package activity8;

class Cake {
    int buffer;
    int capicity;

    Cake(int capicity, int buffer) {
        this.capicity = capicity;
        this.buffer = buffer;
    }

    public synchronized void produceCake(int piece) {

        while ((piece + buffer) > capicity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Allowing Producer to consume more cakes : ");
        }
        System.out.println("Producing....Number : " + piece);
        buffer = buffer + piece;
        notifyAll();

    };

    public synchronized void consumeCake(int piece) {
        while (piece > buffer) {
            System.out.println("Waiting...To Produce Cakes...");
            notifyAll();
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        buffer = buffer - piece;
        System.out.println("Consuming.....Number : " + piece);
    };

}

public class activity8q3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        Cake c = new Cake(10, 8);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                c.consumeCake(1);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.produceCake(2);
            }
        });
        t1.start();
        t2.start();

    }

}
