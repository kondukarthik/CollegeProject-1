# Vehicle Rental System

This Java project is a simple Vehicle Rental System designed using object-oriented principles such as encapsulation, inheritance, and polymorphism. The system allows users to rent vehicles (Cars and Bikes), calculates the rental cost, and displays the details of the rental transaction.

## Key Concepts Used

- **Classes**: Defines the basic structure of the project using Vehicle, Customer, Rental, etc.
- **Inheritance**: Car and Bike inherit common properties and methods from the Vehicle class.
- **Encapsulation**: Data related to rental details, vehicles, and customers is encapsulated within respective classes.
- **Polymorphism**: Different vehicles (Car, Bike) have their own way of calculating rental rates, demonstrating polymorphism in the `calculateRental()` method.

## Project Structure

```bash
VehicleRentalSystem/
│
├── src/
│   ├── Vehicle.java        # Abstract class for vehicles
│   ├── Car.java            # Car class, extends Vehicle
│   ├── Bike.java           # Bike class, extends Vehicle
│   ├── Customer.java       # Customer class
│   ├── Rental.java         # Rental class that connects a customer to a vehicle
│   └── Main.java           # Main class with program entry point
│
└── README.md               # Project documentation
