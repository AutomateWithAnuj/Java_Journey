package Java_Programs._34_Wrapper_classes;

/**
 * Interface representing SIM card behavior.
 */
interface SIMCard {

    // Abstract method to be implemented by classes
    void enterCard();
}


/**
 * Parent class representing old phone functionality.
 */
class OldPhone implements SIMCard {

    // Method to simulate calling from old phone
    void calling() {
        System.out.println("DialPad");
        // Output: DialPad
    }

    // Implementing interface method
    @Override
    public void enterCard() {
        System.out.println("Card entered");
        // Output: Card entered
    }
}

/**
 * Mobile class extending OldPhone and using Wrapper classes
 * to represent attributes as objects.
 */
class Mobile extends OldPhone {

    // Wrapper class attributes (objects, not primitives)
    private Integer phone;
    private String name;
    private Double price;

    // Static variable shared across all Mobile objects
    static String mobileCarrier = "airtel";

    // Default constructor
    Mobile() {
        System.out.println("DC");
        // Output: DC
    }

    // Parameterized constructor
    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    // Displays mobile details
    void display() {
        System.out.println(this.name + this.phone + this.price);
        // Output depends on object data
    }

    // Getter and Setter methods (Encapsulation)
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Static method common to all Mobile objects
    static void switchOnAirplaneMode() {
        System.out.println("Common Airplane Mode");
        // Output: Common Airplane Mode
    }

    // Overriding parent class method
    @Override
    void calling() {
        System.out.println("dial pad touch now");
        // Output: dial pad touch now
    }

    // Method overloading: same method name, different parameters
    void priceChange(Integer price) {
        System.out.println("Change price in integers");
        // Output: Change price in integers
    }

    void priceChange(Double price) {
        System.out.println("Change price in decimals");
        // Output: Change price in decimals
    }
}

/**
 * Demonstrates multiple OOP concepts together:
 * - Wrapper classes
 * - Inheritance
 * - Method overriding
 * - Method overloading
 * - Encapsulation
 * - Static members
 * - Interface implementation
 */
public class P167_WrapperClasses_With_Inheritance {

    /**
     * Program execution starts here.
     */
    public static void main(String[] args) {

        // Creating Mobile objects using wrapper classes as attributes
        Mobile iphone = new Mobile(1, "iPhone 16: ", 126555.55);
        Mobile samsung = new Mobile(1, "Ultra 24: ", 130555.55);

        // Updating price using setter (encapsulation)
        iphone.setPrice(206555.55);

        // Displaying mobile details
        iphone.display();   // Output: iPhone 16: 1 206555.55
        samsung.display();  // Output: Ultra 24: 1 130555.55

        // Accessing static variable using class name
        System.out.println(Mobile.mobileCarrier);
        // Output: airtel

        // Calling static method using class name
        Mobile.switchOnAirplaneMode();
        // Output: Common Airplane Mode

        // Calling overridden method
        iphone.calling();
        // Output: dial pad touch now
    }
}
