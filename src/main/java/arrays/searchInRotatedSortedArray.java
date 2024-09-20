package arrays;

import java.util.Scanner;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        //Given the array nums after the possible rotation and an integer target,
        // return the index of target if it is in nums, or -1 if it is not in nums.
        int input[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("enter the target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println("Index of the target: " + search(input, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
