package VehicleManagementSystem;

public abstract class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String model, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRental(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}

