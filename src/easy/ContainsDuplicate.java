package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tairovich_jr on 2021-06-17.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
    }
}
