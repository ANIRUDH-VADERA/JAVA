package activity5;

class Vehicle {
    int vehicleCount;
    int vehicleTypes = 2;

    Vehicle() {
        System.out.println("Vehicle Constructor getting called from child");
    }

    void show() {
        System.out.println("I am vehicle");
        System.out.println("Vehicle Counts : " + vehicleCount);
        System.out.println("Vehicle Types : " + vehicleTypes);
    }
}

class Car extends Vehicle {
    String carModel;
    int mileage;

    Car(String carModel, int mileage) {
        this.carModel = carModel;
        super.vehicleCount = super.vehicleCount + 1;
        this.mileage = mileage;
    }

    static public void list(Car[] car_array) {
        System.out.println("Cars Model with mileage greater than 23 : ");
        for (int i = 0; i < car_array.length; i++) {
            if (car_array[i].mileage > 23) {
                System.out.println(car_array[i].carModel);
            }
        }
    }

    void show() {
        System.out.println("I am Car");
        System.out.println("Car Model : " + carModel);
        System.out.println("Car Mileage : " + mileage);
    }
}

class Truck extends Vehicle {
    String truckModel;
    int mileage;

    Truck(String truckModel, int mileage) {
        super();
        this.truckModel = truckModel;
        super.vehicleCount = super.vehicleCount + 1;
        this.mileage = mileage;
    }

    void show() {
        System.out.println("I am Truck");
        System.out.println("Truck Model : " + truckModel);
        System.out.println("Truck Mileage : " + mileage);
    }
}

public class activity5q2 {
    public static void main(String[] args) {
        Car[] obj1 = new Car[3];
        for (int i = 0; i < 3; i++) {
            String x = "Model" + (i + 1);
            obj1[i] = new Car(x, ((i * 10) + 20));
        }
        Truck obj2 = new Truck("Model1", 50);
        System.out.println("ANIRUDH VADERA (20BCE2940)");
        obj1[0].show();
        obj1[1].show();
        obj1[2].show();
        Car.list(obj1);
        obj2.show();
    }
}
