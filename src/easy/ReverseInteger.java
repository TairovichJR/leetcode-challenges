package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Created by tairovich_jr on 2021-04-21.
 */
public class ReverseInteger {

    public static int reverse(int x) {

//        String strX = String.valueOf(x).replaceAll("-","").replaceAll("(?!^)0+$", "");
//        long longValue = Long.parseLong(new StringBuffer(strX).reverse().toString());
//        if (longValue > Integer.MAX_VALUE || longValue < Integer.MIN_VALUE){
//            return 0;
//        }
//        return (int)((x < 0) ? (longValue * (-1)): longValue);

        long result = 0;
        boolean negative = false;
        if (x < 0) {
            negative = true;
        }
        x = Math.abs(x);
        while (x > 0) {
            int n = x % 10;
            x = x / 10;
            result = result * 10 + n;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                result = 0;
                break;
            }
        }
        return (int) ((negative) ? (result * -1) : result);
    }
}
