package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-07-24.
 */
public class Leetcode_1295 {



    public int findNumbers(int[] nums) {

        return (int)Arrays.stream(nums).mapToObj(String::valueOf).map( i -> i.length())
                .filter( i -> i % 2 == 0)
                .count();
    }

}
