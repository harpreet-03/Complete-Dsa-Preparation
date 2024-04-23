
/**
 * The `buyAndSellStocks` class calculates the maximum profit that can be obtained by buying and
 * selling stocks at different prices.
 */
import java.util.*;

public class buyAndSellStocks {

    public static int maxProfit(int prices[]) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        // int buyPrice = Integer.MAX_VALUE;
        // int maxProfit = 0;
        // for(int i = 0; i< prices.length; i++){
        // if(buyPrice < prices[i]){
        // int profit = prices[i] - buyPrice; // today's profit
        // maxProfit = Math.max(maxProfit, profit);
        // }else{
        // buyPrice = prices[i];
        // }
        // }
        // return maxProfit;

        /* another one */

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("\nMax Profit: " + maxProfit(prices));
    }
}
