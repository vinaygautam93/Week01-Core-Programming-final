import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false; // If OTP is already in the set, it's not unique
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        // Array to store the generated OTP numbers
        int[] otps = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTP numbers are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}
