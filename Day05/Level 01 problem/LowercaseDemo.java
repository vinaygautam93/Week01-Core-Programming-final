public class LowercaseDemo {

    // Method to convert text to lowercase manually
    public String toLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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
        LowercaseDemo obj = new LowercaseDemo();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String manualLower = obj.toLowerCase(input);
        String builtInLower = input.toLowerCase();

        System.out.println("Manual Conversion: " + manualLower);
        System.out.println("Built-in Conversion: " + builtInLower);
        System.out.println("Are they equal? " + obj.compareStrings(manualLower, builtInLower));
    }
}
