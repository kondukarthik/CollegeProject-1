// Encapsulating customer details
public class Customer {
    private String name;
    private String contact;

    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name + ", Contact: " + contact);
    }
}

