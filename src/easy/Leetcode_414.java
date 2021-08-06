package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-08-06.
 */
public class Leetcode_414 {



    public static int thirdMax(int[] nums) {

        int[] distinct = Arrays.stream(nums).distinct().sorted().toArray();

        if (distinct.length <= 2 ){
          return distinct[distinct.length-1];
        }

        return distinct[distinct.length-3];
    }

    public static void main(String[] args) {

        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }
}
