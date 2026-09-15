package arrays;

import java.util.Arrays;

class Main {

    public static int[] searchRange(int[] nums, int target) {

        int first = firstOccurance(nums, target);
        int last = lastOccurrance(nums, target);

        return new int[]{first, last};
    }

    // Find first occurrence
    public static int firstOccurance(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                first = mid;
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return first;
    }

    // Find last occurrence
    public static int lastOccurrance(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                last = mid;
                start = mid + 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}