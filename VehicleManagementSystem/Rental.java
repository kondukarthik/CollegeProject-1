package VehicleManagementSystem;

public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public Rental(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalRental() {
        return vehicle.calculateRental(rentalDays);
    }

    public String getRentalDetails() {
        return "Customer: " + customer.getName() + 
               ", Vehicle: " + vehicle.getModel() + 
               ", Total Rental Cost: " + calculateTotalRental();
    }
}

