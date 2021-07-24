package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-07-22.
 */
public class Leetcode_1486 {

    public static int xorOperation(int n, int start) {

        return IntStream.range(0, n).map(i -> start + 2 * i).reduce(0, (a, b) -> a ^ b);

    }

    public static void main(String[] args) {
        System.out.println(xorOperation(1, 7));
    }
}
