public class ReverseCalculator {

  
    public static int reverseWithWhileLoop(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

 
    public static int reverseWithForLoop(int number) {
        int reversedNumber = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        return reversedNumber;
    }


    public static int reverseWithDoWhileLoop(int number) {
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);
        return reversedNumber;
    }

    public static void main(String[] args) {
        // Example usage
        int inputNumber = 27;

        // Using while loop
        int reversedWhile = reverseWithWhileLoop(inputNumber);
        System.out.println("Reversed using while loop: " + reversedWhile);

        // Using for loop
        int reversedFor = reverseWithForLoop(inputNumber);
        System.out.println("Reversed using for loop: " + reversedFor);

        // Using do-while loop
        int reversedDoWhile = reverseWithDoWhileLoop(inputNumber);
        System.out.println("Reversed using do-while loop: " + reversedDoWhile);
    }
}