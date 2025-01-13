import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0, temp = num;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] reversed = new int[count];

        // Extract digits and reverse them
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            reversed[count - 1 - i] = digits[i];
            num /= 10;
        }

        // Output reversed array
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
