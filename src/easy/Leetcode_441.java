package easy;

import java.util.Set;

/**
 * Created by tairovich_jr on 2021-08-11.
 */
public class Leetcode_441 {

    public static int arrangeCoins(int n) {

        int count = 0;
        int level = 1;
        while (n >= level){
            n -= level;
            level++;
            count++;
        }
        return count;
    }

     public static void main(String... args) {

         System.out.println(arrangeCoins(2147483647));
    }
}
