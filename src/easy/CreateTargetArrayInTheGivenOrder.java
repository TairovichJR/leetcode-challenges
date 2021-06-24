package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-06-23.
 */
public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            target[i] = nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new CreateTargetArrayInTheGivenOrder().createTargetArray(
                        new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}
                )
        ));
    }
}
