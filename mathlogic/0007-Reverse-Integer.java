package mathlogic;
class Main {

    public static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {

            // Get last digit
            int digit = x % 10;

            // Check overflow before multiplying by 10
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Add digit to reverse
            reverse = reverse * 10 + digit;

            // Remove last digit
            x = x / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }
}