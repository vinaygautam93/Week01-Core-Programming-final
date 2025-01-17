public class UppercaseDemo {

    // Method to convert text to uppercase manually
    public String toUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings
    public boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UppercaseDemo obj = new UppercaseDemo();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String manualUpper = obj.toUpperCase(input);
        String builtInUpper = input.toUpperCase();

        System.out.println("Manual Conversion: " + manualUpper);
        System.out.println("Built-in Conversion: " + builtInUpper);
        System.out.println("Are they equal? " + obj.compareStrings(manualUpper, builtInUpper));
    }
}
