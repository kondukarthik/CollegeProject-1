// Bike inherits from Vehicle
public class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String vehicleNumber, String model, double rentPerDay, boolean hasHelmet) {
        super(vehicleNumber, model, rentPerDay);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Number: " + vehicleNumber + ", Model: " + model + 
                           ", Rent Per Day: " + rentPerDay + ", Helmet Provided: " + (hasHelmet ? "Yes" : "No"));
    }

    @Override
    public double calculateTotalRent(int days) {
        double total = rentPerDay * days;
        return hasHelmet ? total : total + 50;  // Extra charge if no helmet is provided
    }
}
