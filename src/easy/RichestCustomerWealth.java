package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-06-21.
 */
public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        System.out.println(new RichestCustomerWealth().maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
}
