package easy;

import java.util.*;

public class TriangularSumOfArray {

    public static int triangularSum(int[] nums) {
        for (int i = nums.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int n = nums[j] + nums[j+1];
                nums[j] = n%10;
            }
        }
        return nums[0];
    }



}
