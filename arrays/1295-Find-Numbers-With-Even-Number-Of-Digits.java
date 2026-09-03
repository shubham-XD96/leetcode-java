package arrays;

class Main {

    public static int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            int digitCount = 0;

            while (num > 0) {
                digitCount++;
                num /= 10;
            }

            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int result = findNumbers(nums);

        System.out.println(result);
    }
}
