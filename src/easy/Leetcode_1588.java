package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-07-22.
 */
public class Leetcode_1588 {

    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int odd = 1;
        while (odd <= arr.length){
            if (odd % 2 != 0){
                for (int i = 0; i < arr.length && (odd+i) <= arr.length; i++) {
                    int s = IntStream.range(i, odd+i).map(k -> arr[k]).sum();
                    sum += s;
                }
            }
            odd++;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println( new Leetcode_1588().sumOddLengthSubarrays(new int[]{10,11,12}) );
    }
}
