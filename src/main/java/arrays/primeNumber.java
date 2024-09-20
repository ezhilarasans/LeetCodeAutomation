package arrays;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println(" enter the number ");
        int input=new Scanner(System.in).nextInt();
        System.out.println(isPrime(input));
    }
    public static boolean isPrime(int input){
        for(int i=2;i*i<=input;i++)
            if(input%i==0)
                return false;
        return true;
    }
}
