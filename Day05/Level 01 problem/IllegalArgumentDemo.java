public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public void generateIllegalArgumentException(String input) {
        System.out.println(input.substring(5, 3)); // Invalid indices
    }

    // Method to handle IllegalArgumentException
    public void handleIllegalArgumentException(String input) {
        try {
            System.out.println(input.substring(5, 3)); // Invalid indices
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IllegalArgumentDemo obj = new IllegalArgumentDemo();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Generate exception
        try {
            obj.generateIllegalArgumentException(input);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Handle exception
        obj.handleIllegalArgumentException(input);
    }
}
