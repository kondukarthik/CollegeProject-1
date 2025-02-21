// Car inherits from Vehicle
public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleNumber, String model, double rentPerDay, int seatingCapacity) {
        super(vehicleNumber, model, rentPerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Number: " + vehicleNumber + ", Model: " + model + 
                           ", Rent Per Day: " + rentPerDay + ", Seating Capacity: " + seatingCapacity);
    }

    @Override
    public double calculateTotalRent(int days) {
        return rentPerDay * days;  // Simple rent calculation
    }
}
