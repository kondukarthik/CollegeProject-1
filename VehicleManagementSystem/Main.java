package VehicleManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a Customer
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();
        System.out.println("Enter License Number:");
        String licenseNumber = sc.nextLine();
        Customer customer = new Customer(customerName, licenseNumber);

        // Creating a Vehicle (Car)
        System.out.println("Enter Vehicle Number:");
        String vehicleNumber = sc.nextLine();
        System.out.println("Enter Model:");
        String model = sc.nextLine();
        System.out.println("Enter Rental Rate:");
        double rentalRate = sc.nextDouble();
        System.out.println("Is it a luxury car? (true/false)");
        boolean isLuxury = sc.nextBoolean();
        Car car = new Car(vehicleNumber, model, rentalRate, isLuxury);

        // Creating a Rental
        System.out.println("Enter Rental Days:");
        int rentalDays = sc.nextInt();
        Rental rental = new Rental(car, customer, rentalDays);

        // Displaying Rental Details
        System.out.println(rental.getRentalDetails());

        sc.close();
    }
}
