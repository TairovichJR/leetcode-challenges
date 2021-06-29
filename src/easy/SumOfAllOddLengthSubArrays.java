package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-06-25.
 */
public class SumOfAllOddLengthSubArrays {

    public int sumOddLengthSubarrays(int[] arr) {

        int totalSum = 0;
        for (int i = 0; i < arr.length; i+=2) {


            int[] ints = IntStream.range(0, i + 1).map(k -> arr[k]).toArray();
            System.out.println(Arrays.toString(ints));

        }

        return  0;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfAllOddLengthSubArrays().sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    }
}
