package arrays;

public class bestTimeBuySellStockII {
    public static void main(String[] args) {
        //On each day, you may decide to buy and/or sell the stock.
        // You can only hold at most one share of the stock at any time.
        // However, you can buy it then immediately sell it on the same day.
        //Find and return the maximum profit you can achieve
        //Input: prices = [7,1,5,3,6,4]
        //Output: 7
        //Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        // Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        // Total profit is 4 + 3 = 7.

        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(" Maximum profit : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
