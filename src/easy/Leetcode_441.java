package easy;

import java.util.Set;

/**
 * Created by tairovich_jr on 2021-08-11.
 */
public class Leetcode_441 {

    public static int arrangeCoins(int n) {

        int count = 0;
        int sum = 0;


        while (sum <= n){
            count++;
           if (sum+ count < n){
               sum+= count;
           }else{
               return sum;
           }
        }
        return 0;
    }

     public static void main(String... args) {

    }
}
