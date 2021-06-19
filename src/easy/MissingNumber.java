package easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by tairovich_jr on 2021-06-19.
 */
public class MissingNumber {

//    public int missingNumber(int[] nums) {
//
//        Arrays.sort(nums);
//        int result = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i-1] > 1){
//                result =  nums[i] - 1;
//                break;
//            }
//        }
//        if (result == 0 && nums[0] != 0){
//            return result;
//        }
//        if(result == 0 && nums[0] == 0){
//            return nums[nums.length-1] + 1;
//        }
//        return result ;
//    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =(n * (n + 1))/2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{3,4,5,7}));
    }
}
