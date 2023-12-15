//Datatype Exercise 1
public class Rectangle {
    // Private instance variables
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        // Validate if the length is non-negative before setting
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Length should be a non-negative value.");
        }
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        // Validate if the breadth is non-negative before setting
        if (breadth >= 0) {
            this.breadth = breadth;
        } else {
            System.out.println("Breadth should be a non-negative value.");
        }
    }

    // Getter method for length (optional)
    public int getLength() {
        return length;
    }

    // Getter method for breadth (optional)
    public int getBreadth() {
        return breadth;
    }

    // Main method for testing the Rectangle class
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle myRectangle = new Rectangle();

        // Set length and breadth using setter methods
        myRectangle.setLength(5);
        myRectangle.setBreadth(3);

        // Display the values using getter methods (optional)
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());
    }
}
