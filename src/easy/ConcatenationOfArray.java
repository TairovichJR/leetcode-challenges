package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-07-21.
 */
public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length*2];
        System.arraycopy(nums,0, ans, 0, nums.length);
        System.arraycopy(nums,0, ans, nums.length, nums.length);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ConcatenationOfArray().getConcatenation(new int[]{23,43,55})));
    }
}
