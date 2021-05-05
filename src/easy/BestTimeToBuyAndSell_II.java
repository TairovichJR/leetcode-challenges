package easy;

/**
 * Created by tairovich_jr on 2021-05-05.
 */
public class BestTimeToBuyAndSell_II {

    public static int maxProfit(int[] prices) {

        int large = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > large){
                profit = profit + (prices[i] - large );
                large = prices[i];
            }else if(large > prices[i]){
                large = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{1,2,3,1,5}));


    }
}


