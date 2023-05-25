package activity5;

interface Bank {
    int rate_of_interest = 12;
    int no_of_years = 3;

    public void show();
}

abstract class Customer implements Bank {
    String customer_name;
    int customer_id;

    void display() {

    }
}

class Account extends Customer {
    int account_number;
    int account_balance;
    double interest;

    Account(String customer_name, int customer_id, int account_balance, int account_number) {
        this.account_number = account_number;
        this.account_balance = account_balance;
        super.customer_name = customer_name;
        super.customer_id = customer_id;
    }

    public void show() {
        System.out.println("Customer Name = " + customer_name);
        System.out.println("Customer ID = " + customer_id);
        System.out.println("Account No. = " + account_number);
        System.out.println("Account Balance = " + account_balance);
        System.out.println("Interest = " + interest);
    }

    void interest() {
        interest = (account_balance * no_of_years * rate_of_interest) / 100;
    }
}

public class activity5q7 {
    public static void main(String[] args) {
        Account account = new Account("Anirudh", 1, 5000, 28);
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        account.interest();
        account.show();
    }
}
