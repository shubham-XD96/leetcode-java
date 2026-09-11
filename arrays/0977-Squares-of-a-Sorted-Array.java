package arrays;

import java.util.Arrays;

class Main {

    public static int[] sortedSquares(int[] nums) {

        int[] sqr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sqr[i] = nums[i] * nums[i];
        }

        Arrays.sort(sqr);

        return sqr;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}
