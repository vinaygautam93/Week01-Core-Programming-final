import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the two strings
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        // Compare lexicographically
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        }

        sc.close();
    }
}
