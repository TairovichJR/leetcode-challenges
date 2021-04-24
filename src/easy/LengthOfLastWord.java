package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-04-24.
 */
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        return (arr.length < 1) ? 0 : arr[arr.length-1].length();
    }
}
