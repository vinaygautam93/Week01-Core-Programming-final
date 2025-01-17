public class ArrayIndexDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public void generateArrayIndexOutOfBoundsException(String[] array) {
        System.out.println(array[array.length]); // Access index out of bounds
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public void handleArrayIndexOutOfBoundsException(String[] array) {
        try {
            System.out.println(array[array.length]); // Access index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayIndexDemo obj = new ArrayIndexDemo();

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] array = new String[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        // Generate exception
        try {
            obj.generateArrayIndexOutOfBoundsException(array);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Handle exception
        obj.handleArrayIndexOutOfBoundsException(array);
    }
}
