package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-04-29.
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < nums1.length ; i++, j++) {
            nums1[i] = nums2[j];
        }
      Arrays.sort(nums1);
    }

    public static void main(String[] args) {


        int[] nums1 = {-1,0,0,3,3,3,0,0,0};

        int[] nums2 = {1,2,2};

        merge(nums1, 6, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}
