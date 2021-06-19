package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tairovich_jr on 2021-06-17.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k){
                return  true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
