package arrays;

import java.util.Scanner;

public class nearestPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("nearest prime number "+nearestPrimeNumber(number));

    }

    private static int nearestPrimeNumber(int input) {

        int previous = 0;
        boolean previousFlag = true;
        boolean nextFlag = true;
        int next = 0;
        int i, j;

        for (i = input - 1, j = input + 1; i > 0; i--, j++) {
            if (primeNumber.isPrime(i) && previousFlag == true) {
                previous = i;
                previousFlag = false;
            }
            if (primeNumber.isPrime(j) && nextFlag == true) {
                next = i;
                nextFlag = false;
            }
            if (previousFlag == false && nextFlag == false)
                break;

        }

        if (input - previous > Math.abs(input - next))
            return next;
        else if (input - previous < Math.abs(input - next))
            return previous;
        else
            return next;
    }
}
