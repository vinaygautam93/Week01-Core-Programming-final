import java.util.Scanner;

public class ExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public void generateStringIndexOutOfBoundsException(String input) {
        System.out.println(input.charAt(input.length())); // Access index out of bounds
    }

    // Method to handle StringIndexOutOfBoundsException
    public void handleStringIndexOutOfBoundsException(String input) {
        try {
            System.out.println(input.charAt(input.length())); // Access index out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionDemo obj = new ExceptionDemo();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Generate exception
        try {
            obj.generateStringIndexOutOfBoundsException(input);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Handle exception
        obj.handleStringIndexOutOfBoundsException(input);
    }
}
