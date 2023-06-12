package activity8;

import java.util.Scanner;

class notInRange extends Exception {
    public notInRange(String message) {
        super(message);
    }
}

class Items {
    String[] stationary_items;
    int[] price;
    String[] itemsPriceRemoved = new String[100];
    int counter_removed = 0;

    public void validate(String input) throws notInRange {
        int flag = 0;
        System.out.println("lenght = " + itemsPriceRemoved[0]);
        for (int i = 0; i < counter_removed; i++) {
            if (input.equals(itemsPriceRemoved[i])) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            throw new notInRange("This Item price is not available in the price List : ");
        }
    }

    Items(String[] stationary_items, int[] price, int[] link, int end) {
        this.stationary_items = stationary_items;
        this.price = price;
    }

    public synchronized void removeDetails(String itemName) {
        int to_remove = 0;
        for (int i = 0; i < stationary_items.length; i++) {
            if (stationary_items[i].equals(itemName)) {
                to_remove = i;
                break;
            }
        }
        stationary_items[to_remove] = "NULL";
        price[to_remove] = -1;
    }

    public synchronized void removePrice(String itemName) {
        int to_remove = 0;
        for (int i = 0; i < stationary_items.length; i++) {
            if (stationary_items[i].equals(itemName)) {
                to_remove = i;
                break;
            }
        }
        itemsPriceRemoved[counter_removed++] = stationary_items[to_remove];
        price[to_remove] = -1;
    }

    public synchronized void Display(String itemName) {
        int to_display = 0;
        int flag_t = 0;
        for (int i = 0; i < stationary_items.length; i++) {
            if (stationary_items[i].equals(itemName)) {
                to_display = i;
                flag_t = 1;
                break;
            }
        }
        if (flag_t == 0) {
            System.out.println("The item doesnt exist or is deleted from the list : ");
        } else {
            System.out.println("The Item Name is : " + stationary_items[to_display]);
            try {
                validate(stationary_items[to_display]);
                System.out.println("The Item Price is : " + price[to_display]);
            } catch (notInRange e) {
                e.printStackTrace();
            }
        }
    }

}

public class activity8q1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println("Enter the Number of Items : ");
        int n = in.nextInt();
        String[] stationary_items = new String[n];
        int[] price = new int[n];
        int[] link = new int[n];
        for (int i = 0; i < n; i++) {
            link[i] = i;
        }
        System.out.println("Enter the initial Item Details : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Item : " + (i + 1));
            System.out.print("Item Name : ");
            in.nextLine();
            stationary_items[i] = in.nextLine();
            System.out.print("Item Price : ");
            price[i] = in.nextInt();
        }
        in.nextLine();
        System.out.print("Item Name to be removed : ");
        String item1 = in.nextLine();
        Items items = new Items(stationary_items, price, link, n);
        Thread t1 = new Thread(() -> {
            items.removeDetails(item1);
        });
        System.out.print("Item Price to be removed : ");
        String item2 = in.nextLine();
        Thread t2 = new Thread(() -> {
            items.removePrice(item2);
        });
        System.out.print("Item to be Displayed : ");
        String item3 = in.nextLine();
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            items.Display(item3);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t3.join();
        in.close();
    }
}