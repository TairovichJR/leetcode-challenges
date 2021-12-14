package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-12-13.
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    for (int l = j+1; l < nums2.length; l++) {
                        if (nums1[i] < nums2[l]){
                            result[k] = nums2[l];
                            break;
                        }
                    }
                    if (result[k] == 0){
                        result[k] = -1;
                    }
                    k++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString( new NextGreaterElementI().nextGreaterElement(new int[]{4,1,2},
                        new int[]{1,3,4,2}))
        );
    }
}
