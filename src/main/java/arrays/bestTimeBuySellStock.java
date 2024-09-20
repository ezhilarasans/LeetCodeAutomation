package arrays;

public class bestTimeBuySellStock {
    public static void main(String[] args) {
        //You are given an array prices where prices[i] is the price of a given stock on the ith day.
        //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(" Maximum profit : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int temp : prices) {
            if (min > temp)
                min = temp;
            else if (profit < (temp - min))
                profit = temp - min;
        }
        return profit;
    }
}
