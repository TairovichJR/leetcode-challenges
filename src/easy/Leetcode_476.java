package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-11-18.
 */
public class Leetcode_476 {

    public int findComplement(int num) {

        String bin = Integer.toBinaryString(num);
        String flipped = "";
        for (int i = 0; i < bin.length(); i++) {
            flipped += bin.charAt(i) == '1' ? "0" : "1";
        }
       return Integer.parseInt(flipped,2);
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,3,4,5,6};


    }
    public static int[] removeDuplicates(int[] nums){
        return  Arrays.stream(nums).distinct().toArray();
    }
 }
