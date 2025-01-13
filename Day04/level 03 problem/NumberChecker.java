import java.util.Scanner;

public class NumberChecker {

    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public boolean isDuckNumber(int number) {
        while (number > 0) {
            if (number % 10 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public boolean isArmstrong(int number) {
        int sum = 0, temp = number;
        int digitCount = countDigits(number);
        while (temp != 0) {
            sum += Math.pow(temp % 10, digitCount);
            temp /= 10;
        }
        return sum == number;
    }

    public int[] findLargestDigits(int number) {
        int[] digits = new int[countDigits(number)];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (checker.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        int digitCount = checker.countDigits(number);
        System.out.println("Digit count: " + digitCount);

        int sumOfDigits = checker.sumOfDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits);

        if (checker.isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        int[] largestDigits = checker.findLargestDigits(number);
        System.out.println("Largest digit: " + largestDigits[0]);
        System.out.println("Second largest digit: " + largestDigits[1]);

            }
}
