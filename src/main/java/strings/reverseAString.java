package strings;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse: ");
        String input=new Scanner(System.in).nextLine();
        System.out.println("reversed String : "+reverseString(input));
    }

    public static String reverseString(String original) {
        int low = 0, high = original.length() - 1;
        char[] temp = original.toCharArray();
        while (low < high) {
            char newTemp = temp[low];
            temp[low++] = temp[high];
            temp[high--] = newTemp;
        }
        return String.valueOf(temp);
    }
}
