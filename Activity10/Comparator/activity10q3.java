package activity10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String bookName;
    String author;
    int price;
    String type;

    Book() {
        bookName = "";
        author = "";
        price = 0;
        type = "";
    }

    Book(Book b) {
        this.bookName = b.bookName;
        this.type = b.type;
        this.price = b.price;
        this.author = b.author;
    }

    void input(String bookName, String author, int price, String type) {
        this.author = author;
        this.bookName = bookName;
        this.price = price;
        this.type = type;
    }
}

public class activity10q3 {
    static List<Book> fiction = new ArrayList<>();
    static List<Book> comic = new ArrayList<>();
    static List<Book> cooking = new ArrayList<>();
    static int book_count;

    static void sort_by_Bookname(List<Book> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(j).bookName).compareTo((list.get(min).bookName)) < 0)
                    min = j;
            }
            if (min != i) {
                Book temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }

    static Book maxPriced(List<Book> list, boolean flag) {
        Book max = list.get(0);
        for (Book i : list) {
            if (flag == true && i.price > max.price)
                max = i;
            else if (flag == false && i.price < max.price)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books : ");
        book_count = sc.nextInt();
        sc.nextLine();

        Book temp = new Book();
        for (int i = 0; i < book_count; i++) {

            System.out.println("Enter book name : ");
            temp.bookName = sc.nextLine();
            System.out.println("Enter author name : ");
            temp.author = sc.nextLine();
            System.out.println("Enter price : ");
            temp.price = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter book type (fiction, comic, cooking) : ");
            temp.type = sc.nextLine();

            Book insert = new Book(temp);

            if (temp.type.equals("comic"))
                comic.add(insert);
            else if (temp.type.equals("fiction"))
                fiction.add(insert);
            else if (temp.type.equals("cooking"))
                cooking.add(insert);
            else {
                System.out.println("Wrong type entered!");
                System.exit(0);
            }
        }

        System.out.println("Comic books : ");
        for (Book i : comic)
            System.out.print(i.bookName + "\t");
        System.out.println();

        System.out.println("Fiction books : ");
        for (Book i : fiction)
            System.out.print(i.bookName + "\t");
        System.out.println();

        System.out.println("Cooking books : ");
        for (Book i : cooking)
            System.out.print(i.bookName + "\t");
        System.out.println();

        sort_by_Bookname(comic);
        System.out.println("(After Sorting)Comic books : ");
        for (Book i : comic)
            System.out.print(i.bookName + "\t");
        System.out.println();

        sort_by_Bookname(fiction);
        System.out.println("(After Sorting)Fiction books : ");
        for (Book i : fiction)
            System.out.print(i.bookName + "\t");
        System.out.println();

        sort_by_Bookname(cooking);
        System.out.println("(After Sorting)Cooking books : ");
        for (Book i : cooking)
            System.out.print(i.bookName + "\t");
        System.out.println();

        System.out.println("Max priced comic book : " + maxPriced(comic, true).bookName + "Price : "
                + maxPriced(comic, true).price);
        System.out.println("Min priced comic book : " + maxPriced(comic, false).bookName + "Price : "
                + maxPriced(comic, false).price);

        System.out.println("Max priced fiction book : " + maxPriced(fiction, true).bookName + "Price : "
                + maxPriced(fiction, true).price);
        System.out.println("Min priced fiction book : " + maxPriced(fiction, false).bookName + "Price : "
                + maxPriced(fiction, false).price);

        System.out.println("Max priced cooking book : " + maxPriced(cooking, true).bookName + "Price : "
                + maxPriced(cooking, true).price);
        System.out.println("Min priced cooking book : " + maxPriced(cooking, false).bookName + "Price : "
                + maxPriced(cooking, false).price);
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        sc.close();
    }
}
