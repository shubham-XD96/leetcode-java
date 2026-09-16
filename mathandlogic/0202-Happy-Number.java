package mathandlogic;

import java.util.HashSet;

class Main {

    public static boolean isHappy(int n) {

        // Store numbers that we have already seen
        HashSet<Integer> seen = new HashSet<>();

        // Continue until n becomes 1
        while (n != 1) {

            // If we see the same number again,
            // it means we are stuck in a cycle
            if (seen.contains(n)) {
                return false;
            }

            // Store the current number
            seen.add(n);

            int sum = 0;

            // Calculate sum of squares of digits
            while (n > 0) {

                // Get the last digit
                int digit = n % 10;

                // Add square of the digit
                sum = sum + digit * digit;

                // Remove the last digit
                n = n / 10;
            }

            // Make the calculated sum the new n
            n = sum;
        }

        // n became 1, so it is a Happy Number
        return true;
    }

    public static void main(String[] args) {

        int n = 19;

        boolean result = isHappy(n);

        System.out.println("Is " + n + " a Happy Number? " + result);
    }
}