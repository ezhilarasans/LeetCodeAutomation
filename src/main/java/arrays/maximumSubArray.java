package arrays;

public class maximumSubArray {
    public static void main(String[] args) {
        //Given an integer array nums, find the subarray with the largest sum, and return its sum.
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("maximum subArray: " + maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int maxsum = nums[0], currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i] + currentSum, nums[i]);
            maxsum = Math.max(currentSum, maxsum);
        }
        return maxsum;
    }
}
