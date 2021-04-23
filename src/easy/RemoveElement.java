package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-04-23.
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

//        int[] ints = Arrays.stream(nums).filter(i -> i != val).toArray();
//        for (int i =0; i < ints.length; i++){
//            nums[i] = ints[i];
//        }
//        return ints.length;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,2,2,1,5,6},2));
    }
}
