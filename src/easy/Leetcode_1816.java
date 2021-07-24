package easy;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-07-23.
 */
public class Leetcode_1816 {

    public static String truncateSentence(String s, int k) {

        String[] sentence = s.split(" ");
        String result = "";
        for (int i = 0; i < k; i++) {

            result += sentence[i] + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello world there fdasdfja asdfasdf", 3));
    }
}
