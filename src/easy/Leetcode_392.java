package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-08-17.
 */
public class Leetcode_392 {

    public static  boolean isSubsequence(String s, String t) {
        String temp = "";
        int k = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //abcde
            for (int j = 0; j < t.length() ; j++) {
                if (k < j && c == t.charAt(j)) {
                    temp += t.charAt(j);
                    k = j;
                    break;
                }
            }
        }
        return s.equals(temp);
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("aaa", "baa"));
    }
}
