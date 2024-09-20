package arrays;

import java.util.Scanner;

public class firstMissingPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements");
        int n=sc.nextInt();
        int input[]=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
            input[i]=sc.nextInt();
        System.out.println("first Missing Positive : "+firstMissingPositive(input));
        //Input: nums = [3,4,-1,1]
        //Output: 2
    }
    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
            if (nums[i] <= 0 || nums[i] > n) //if it is negative or greater than length
                nums[i]=n+1;
        for(int i=0;i<n;i++){//[3,4,5,1]
            int num =Math.abs(nums[i]);
            if (num > n)
                continue;
            //numbers within the given range
            num--;//
            if (nums[num] > 0)
                nums[num] = -1 * nums[num];//[-3,4,-5,-1]

        }
        for (int i = 0; i < n; i++)
            if (nums[i] >= 0)
                return i + 1;
        return n + 1;
    }
    //steps 1. the number should be in given range. {1 to number of element} 2. if it exceeds or negative make it n+1
    //3. Iterate the number again and consider the value as index and make it -ve.
    // 4. iterate again and which indexed values is not -ve, then it is the missed number.

}
