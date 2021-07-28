package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-07-28.
 */
public class Leetcode_1913 {
    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);
        int min = nums[0] * nums[1];
        int max = nums[nums.length-2] * nums[nums.length-1];
        return max - min;

    }
}
