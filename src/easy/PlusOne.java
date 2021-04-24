package easy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-04-24.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String strNumber = Arrays.stream(digits)
                .mapToObj(i -> String.valueOf(i))
                .collect(Collectors.joining());


        BigDecimal bigDecimal = new BigDecimal(strNumber);
        BigDecimal added = bigDecimal.add(new BigDecimal(1));

        String[] split = String.valueOf(added).split("");
        return Arrays.stream(split).mapToInt(i -> Integer.parseInt(i)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println( Arrays.toString(plusOne(new int[]{9,9,9,9,9,9,9,9,9})));
    }
}
