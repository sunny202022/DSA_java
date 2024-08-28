package array;

public class bestTimeToSellAndBuyStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,4,3,6,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;        
    }
}
