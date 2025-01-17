public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public void generateNumberFormatException(String input) {
        System.out.println(Integer.parseInt(input)); // Invalid conversion
    }

    // Method to handle NumberFormatException
    public void handleNumberFormatException(String input) {
        try {
            System.out.println(Integer.parseInt(input)); // Invalid conversion
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormatDemo obj = new NumberFormatDemo();

        System.out.println("Enter a number as a string:");
        String input = sc.nextLine();

        // Generate exception
        try {
            obj.generateNumberFormatException(input);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Handle exception
        obj.handleNumberFormatException(input);
    }
}
