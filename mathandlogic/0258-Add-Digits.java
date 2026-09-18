package mathandlogic;
class Main {

    public static int addDigits(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {

        int num = 38;

        int result = addDigits(num);

        System.out.println("Result: " + result);
    }
}