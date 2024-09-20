package arrays;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println(" Enter the number for factorial: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println("Factorial of :" + input + " is : " + factorial(input));
    }

    public static int factorial(int n) {
        if (n < 3)
            return n;
        return n * factorial(n - 1);
    }
}
