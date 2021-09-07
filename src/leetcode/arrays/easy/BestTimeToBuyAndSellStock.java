package leetcode.arrays.easy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;

        int buy = 0;
        int sell = 1;
        int curProfit;
        while(sell < prices.length) {
            curProfit = prices[sell] - prices[buy];
            if(prices[buy] > prices[sell]) {
                buy = sell;
            }
            sell++;
            maxProfit = Math.max(curProfit, maxProfit);
        }

        return maxProfit;
    }
}
