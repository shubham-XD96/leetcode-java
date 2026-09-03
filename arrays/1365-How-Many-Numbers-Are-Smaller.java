package arrays;

class Main {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        int[] answer = smallerNumbersThanCurrent(nums);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
