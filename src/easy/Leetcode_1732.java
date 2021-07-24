package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-07-23.
 */
public class Leetcode_1732 {

    public static int largestAltitude(int[] gain) {

        int[] arr = new int[gain.length+1];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = gain[i-1] + arr[i-1];
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
