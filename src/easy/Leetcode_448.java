package easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-08-20.
 */
public class Leetcode_448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
        if (nums[0] == nums[nums.length-1]){
            if (nums[0] > 1){
                return List.of(nums[0]-1);
            }else{
                return List.of(nums[0]+1);
            }

        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] > 1 ){
                int diff = nums[i+1] - nums[i];
                for (int j = 0; j < diff-1; j++) {
                    list.add( nums[i] + (j+1) );
                }
            }
        }
        return list;
    }


}
