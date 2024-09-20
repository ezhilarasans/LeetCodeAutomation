package arrays;

public class stopFlag {
    public static void main(String[] args) {
 /*Write a program to Print the numbers sum from the list starting from the beginning,
                when there is the occurrence of 6 skip the list till you get 9 and continue the process.
{1, 2, 6, 3, 4, 5, 9, 7, 8,6,4,5,9,5}*/
        //23
        int input[] = {1, 2, 6, 3, 4, 5, 9, 7, 8, 6, 4, 5, 9, 5};
        int sum = 0;
        boolean stopFlag = false;
        for (int i = 0; i < input.length; i++) {

            if (input[i] == 6) {
                stopFlag = true;
                continue;
            } else if (input[i] == 9) {
                stopFlag = false;
                continue;
            }

            if (stopFlag == false) {
                sum += input[i];
            }
        }
        System.out.println(sum);
    }
}
