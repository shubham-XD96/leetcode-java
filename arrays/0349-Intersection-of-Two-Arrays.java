package arrays;
import java.util.HashSet;
import java.util.Arrays;

class Main {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store nums1 elements
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        // Find common elements
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        // Convert HashSet to int[]
        int[] ans = new int[result.size()];

        int i = 0;
        for (int num : result) {
            ans[i] = num;
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] arr = intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(arr));
    }
}


