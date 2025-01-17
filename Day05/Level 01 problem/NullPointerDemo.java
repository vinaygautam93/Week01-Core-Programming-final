public class NullPointerDemo {

    // Method to generate NullPointerException
    public void generateNullPointerException() {
        String text = null; // Initialize the variable to null
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public void handleNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            System.out.println(text.length()); // Attempt to access the length method
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        NullPointerDemo obj = new NullPointerDemo();

        // Generate exception
        try {
            obj.generateNullPointerException();
        } catch (Exception e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Handle exception
        obj.handleNullPointerException();
    }
}
