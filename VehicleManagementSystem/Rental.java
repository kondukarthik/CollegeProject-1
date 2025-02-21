// Manages rentals and encapsulates rental process
public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;

    public Rental(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public void displayRentalDetails() {
        System.out.println("\nRental Details:");
        customer.displayCustomer();
        vehicle.displayDetails();
        System.out.println("Total Rent: " + vehicle.calculateTotalRent(rentalDays));
    }
}


