package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-08-25.
 */
public class Leetcode_453 {

    public static int minMoves(int[] nums) {

        int min = Arrays.stream(nums).min().getAsInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count+= nums[i] - min;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1,2,3}));
    }
}
