package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-04-21.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
           for (int j = i+1; j < nums.length; j++){
               int numOne = nums[i];
               int numTwo = nums[j];
               if (numOne+ numTwo == target){
                   return new int[]{i, j};
               }
           }
        }
        return new int[]{0,0};
    }

}
