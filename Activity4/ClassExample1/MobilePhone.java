package activity4;

import java.util.Scanner;

public class MobilePhone {
    String ModelName;
    String CompanyName;
    int Price;
    int YearOfManufacture;

    void set_mobileDetails(String ModelName, String CompanyName, int Price, int YearOfManufacture) {
        this.ModelName = ModelName;
        this.CompanyName = CompanyName;
        this.Price = Price;
        this.YearOfManufacture = YearOfManufacture;
    }

    static void sort_mobileDetails(MobilePhone[] mobilePhoneArray) {
        int min_idx = 0;
        MobilePhone temp;
        for (int i = 0; i < mobilePhoneArray.length - 1; i++) {
            min_idx = i;
            for (int j = i + 1; j < mobilePhoneArray.length; j++) {
                if (mobilePhoneArray[min_idx].CompanyName.compareTo(mobilePhoneArray[j].CompanyName) > 0) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                temp = mobilePhoneArray[min_idx];
                mobilePhoneArray[min_idx] = mobilePhoneArray[i];
                mobilePhoneArray[i] = temp;
            }
        }
    }

    static void display_mobileDetails(MobilePhone[] mobilePhoneArray) {
        for (int i = 0; i < mobilePhoneArray.length; i++) {
            System.out.println("Details For Mobile : " + (i + 1));
            System.out.println("ModelName : " + mobilePhoneArray[i].ModelName);
            System.out.println("CompanyName : " + mobilePhoneArray[i].CompanyName);
            System.out.println("Price : " + mobilePhoneArray[i].Price);
            System.out.println("yearOfManufacture : " + mobilePhoneArray[i].YearOfManufacture);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Mobiles : ");
        n = in.nextInt();
        MobilePhone[] array_object = new MobilePhone[n];
        System.out.println("Enter the MobilePhone Details: ");
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.println("Mobile Phone : " + (i + 1));
            System.out.print("ModelName : ");
            String ModelName = in.nextLine();
            System.out.print("Company Name : ");
            String CompanyName = in.nextLine();
            System.out.print("Price : ");
            int Price = in.nextInt();
            System.out.print("Year of Manufacture : ");
            int YearOfManufacture = in.nextInt();
            array_object[i] = new MobilePhone();
            array_object[i].set_mobileDetails(ModelName, CompanyName, Price, YearOfManufacture);
        }
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        System.out.println("Before Sorting the Mobile Details are : ");
        MobilePhone.display_mobileDetails(array_object);
        MobilePhone.sort_mobileDetails(array_object);
        System.out.println("After Sorting the Mobile Details are : ");
        MobilePhone.display_mobileDetails(array_object);
        in.close();
    }

}
