package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tairovich_jr on 2022-03-20.
 */
public class IntersectionOfTwoArrays {


    public int[] intersection(int[] nums1, int[] nums2) {


//        String nums = "";
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]){
//                    nums += nums1[i] + ",";
//                }
//            }
//        }
//        if (nums.isEmpty()) {
//            return new int[]{};
//        }
//        return Arrays.stream(nums.split(",")).distinct().mapToInt(Integer::parseInt).toArray();

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

        new IntersectionOfTwoArrays().intersection(new int[]{61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81},
                new int[]{5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48});

    }
}
