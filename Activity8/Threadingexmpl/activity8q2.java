package activity8;

class BusTicketRegistration {
    String BusName;
    int noOfSeats;

    BusTicketRegistration(String BusName, int noOfSeats) {
        this.BusName = BusName;
        this.noOfSeats = noOfSeats;
    }

    public synchronized void Register_Seat() {
        while (noOfSeats <= 0) {
            System.out.println("Waiting.... " + Thread.currentThread().getId());
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        noOfSeats = noOfSeats - 1;
    }

    public synchronized void Allot_Seat(int seatsToAllocate) {
        System.out.println("ALLOCATING SEATS.....");
        noOfSeats = noOfSeats + seatsToAllocate;
        notifyAll();
    }
}

public class activity8q2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        BusTicketRegistration registration = new BusTicketRegistration("Red Bus", 0);
        Thread t1 = new Thread(() -> {
            registration.Register_Seat();
        });
        Thread t2 = new Thread(() -> {
            registration.Register_Seat();
        });
        Thread t3 = new Thread(() -> {
            registration.Allot_Seat(60);
        });
        Thread t4 = new Thread(() -> {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("The total Seats after registration is : " + registration.noOfSeats);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Main Thread :");
    }
}
