package arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {-2, 0, -1};
        System.out.println("Maximum Product Sub array is : " + maxProduct(nums));

    }

    public static int maxProduct(int[] nums) {
        int prod = 1;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            result = Math.max(result, prod);
            if (prod == 0) {
                prod = 1;
            }
        }
        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prod *= nums[i];
            result = Math.max(result, prod);
            if (prod == 0) {
                prod = 1;
            }
        }
        return result;
    }
}
