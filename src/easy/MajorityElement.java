package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by tairovich_jr on 2021-06-06.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                Integer value = map.get(nums[i]);
                map.put(nums[i], value+1);
            }else {
                map.put(nums[i], 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        Integer biggest = map.values().stream().max(Integer::compareTo).get();
        Integer result = map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(biggest))
                .mapToInt(Map.Entry::getKey).findFirst().getAsInt();
        return  result;
    }

    public static int majorityElement2(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {

        System.out.println(majorityElement2(new int[]{6,6,6,5,5,7,7,7,7}));
    }
}



