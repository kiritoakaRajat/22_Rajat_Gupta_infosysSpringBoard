public class Chocolate {
    private int barCode;
    private String name;
    private double weight;
    private double cost;

    // Default constructor
    public Chocolate() {
        // Default values
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    // Parameterized constructor with the "this" keyword
    public Chocolate(int barCode, String name, double weight, double cost) {
        // Using "this" keyword to distinguish between instance variables and parameters
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Getter and setter methods

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static void main(String[] args) {
        // Creating an instance of Chocolate using the default constructor
        Chocolate defaultChocolate = new Chocolate();

        // Displaying default values
        System.out.println("Default Chocolate Details:");
        displayChocolateDetails(defaultChocolate);

        // Creating an instance of Chocolate using the parameterized constructor
        Chocolate customChocolate = new Chocolate(102, "Hershey's", 24, 50);

        // Displaying custom values
        System.out.println("\nCustom Chocolate Details:");
        displayChocolateDetails(customChocolate);
    }

    // Method to display chocolate details
    private static void displayChocolateDetails(Chocolate chocolate) {
        System.out.println("Bar Code: " + chocolate.getBarCode());
        System.out.println("Name: " + chocolate.getName());
        System.out.println("Weight: " + chocolate.getWeight() + " ounces");
        System.out.println("Cost: $" + chocolate.getCost());
    }
}