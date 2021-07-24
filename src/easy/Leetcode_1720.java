package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-07-22.
 */
public class Leetcode_1720 {

    public static  int[] decode(int[] encoded, int first) {

        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = encoded[i-1] ^ arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[]{6,2,7,3}, 4)));
    }
}
