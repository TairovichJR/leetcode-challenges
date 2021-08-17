package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-08-17.
 */
public class Leetcode_344 {

    public static void reverseString(char[] s) {

        for (int i = 0, j = s.length-1; i < s.length/2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {

        char[] c = {'h','e','l','l','o'};

        reverseString(c);

        System.out.println(Arrays.toString(c));
    }
}
