import java.util.*;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating sample vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MH12AB1234", "Toyota Corolla", 2000, 5));
        vehicles.add(new Bike("MH14XY5678", "Honda CB Shine", 500, true));
        System.out.println("Available Vehicles:");
        for (Vehicle v : vehicles) {
            v.displayDetails();
        }
        // Taking customer input
        System.out.print("\nEnter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();
        Customer customer = new Customer(name, contact);
        // Choosing a vehicle
        System.out.print("\nEnter vehicle number to rent: ");
        String vehicleNum = sc.nextLine();
        Vehicle selectedVehicle = null;
        for (Vehicle v : vehicles) {
            if (v.getVehicleNumber().equals(vehicleNum)) {
                selectedVehicle = v;
                break;
            }
        }
        if (selectedVehicle == null) {
            System.out.println("Invalid vehicle number! Exiting...");
            return;
        }
        // Enter rental days
        System.out.print("Enter number of days for rental: ");
        int days = sc.nextInt();
        // Create Rental and display details
        Rental rental = new Rental(customer, selectedVehicle, days);
        rental.displayRentalDetails();
    }
}
