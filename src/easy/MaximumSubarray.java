package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-04-23.
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int curSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            curSum += nums[i];

            curSum = Math.max(curSum, nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));


    }
}
