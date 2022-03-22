package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tairovich_jr on 2022-03-20.
 */
public class IntersectionOfTwoArrays {


    public int[] intersection(int[] nums1, int[] nums2) {


/*        String nums = "";
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    nums += nums1[i] + ",";
                }
            }
        }
        if (nums.isEmpty()) {
            return new int[]{};
        }
        return Arrays.stream(nums.split(",")).distinct().mapToInt(Integer::parseInt).toArray();*/

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        new IntersectionOfTwoArrays().intersection(new int[]{4,9,5},
                new int[]{9,4,9,8,4});

      //  System.out.println("11-2-3-4-5-".indexOf("[0-9]"));
    }
}
