package easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by tairovich_jr on 2021-04-23.
 */
public class RemoveDuplicatesFromSortedArray {


    public static int removeDuplicates(int[] nums) {

//        int i=0, length=nums.length, resultInex=1;
//        while(i<length-1)
//        {
//            if(nums[i]!=nums[i+1]){
//                nums[resultInex++]=nums[i+1];
//            }
//            i++;
//        }
//        return resultInex;

        int[] ints = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < ints.length; i++) {
            nums[i] = ints[i];

        }
        return  ints.length;

    }


    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1,2,2,3,3,4,4};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }

}
