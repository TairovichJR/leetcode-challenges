package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-04-23.
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }else if (target > nums[i] && target < nums[i]){
                return i+1;
            }else if (target< nums[i]){
                return i;
            }
        }
        return nums.length;
    }

}
