// Abstract class for abstraction
public abstract class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected double rentPerDay;

    public Vehicle(String vehicleNumber, String model, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    public abstract void displayDetails();  // Abstract method

    public abstract double calculateTotalRent(int days);  // Abstract method

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
