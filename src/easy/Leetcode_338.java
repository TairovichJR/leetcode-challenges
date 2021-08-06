package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-07-29.
 */
public class Leetcode_338 {

    public int[] countBits(int n) {

        int[] bits = new int[n+1];
        for (int i = 0; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1'){
                    count += Integer.parseInt(String.valueOf(bin.charAt(j)));
                }
            }
            bits[i] = count;
        }
        return  bits;
    }
}
