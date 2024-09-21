package VehicleManagementSystem;

public class Car extends Vehicle {
    private boolean luxury;

    public Car(String vehicleNumber, String model, double rentalRate, boolean luxury) {
        super(vehicleNumber, model, rentalRate);
        this.luxury = luxury;
    }

    @Override
    public double calculateRental(int days) {
        return days * rentalRate * (luxury ? 1.5 : 1.0);
    }

    public boolean isLuxury() {
        return luxury;
    }
}

