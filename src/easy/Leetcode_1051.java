package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-07-29.
 */
public class Leetcode_1051 {


    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(heights);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) count++;
        }
        return count;
    }

}
