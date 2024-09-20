package arrays;


public class fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++)
            System.out.println(fibonacciSeries(i));
//1,1,2,3,5,8,13,21,34,55,89..
    }

    private static int fibonacciSeries(int n) {
        if (n < 3)
            return 1;
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
}
