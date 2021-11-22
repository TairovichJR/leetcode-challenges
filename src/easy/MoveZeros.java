package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-11-19.
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int[] nonZeros =  Arrays.stream(nums).filter( i -> i != 0).toArray();
        for (int i = 0; i < nonZeros.length; i++) {
            nums[i] = nonZeros[i];
        }
        Arrays.fill(nums, nonZeros.length, nums.length,0);
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        new MoveZeros().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
