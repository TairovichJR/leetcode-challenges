package easy;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-05-02.
 */
public class BestTimeToAndSellStock {

    public static int maxProfit(int[] prices) {

      int smallest = Integer.MAX_VALUE;
      int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < smallest){
                smallest = prices[i];
            }else if(prices[i] - smallest > profit){
                profit = prices[i] - smallest;
            }
        }
      return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,4,3,1}));
    }
}
