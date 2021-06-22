package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-06-21.
 */
public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length / 2; i++, j+=2) {
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(1%2);
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{1,1,2,2},2)));
    }
}
