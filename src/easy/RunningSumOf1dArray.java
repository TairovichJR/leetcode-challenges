package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-06-20.
 */
public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = IntStream.range(0, i + 1).map(k -> nums[k]).sum();
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString( new RunningSumOf1dArray().runningSum(new int[]{1,1,1,1,1})));
    }
}
