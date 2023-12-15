//DataTypes Exercise 2
public class Rectangle_peri {
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

    // calculatePerimeter method
    public void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }

    // Main method for testing the Rectangle class
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle_peri myRectangle = new Rectangle_peri();

        // Set length and breadth using setter methods
        myRectangle.setLength(5);
        myRectangle.setBreadth(3);

        // Display the values using getter methods (optional)
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());
	myRectangle.calculatePerimeter();
    }
}
