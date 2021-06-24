package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tairovich_jr on 2021-06-24.
 */
public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i+=2) {
            int freq = nums[i];
            int val = nums[i+1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                new DecompressRunLengthEncodedList().decompressRLElist(new int[]{1,1,2,3})));
    }
}
