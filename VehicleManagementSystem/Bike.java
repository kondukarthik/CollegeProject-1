package VehicleManagementSystem;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, model, rentalRate);
    }

    @Override
    public double calculateRental(int days) {
        return days * rentalRate;
    }
}

