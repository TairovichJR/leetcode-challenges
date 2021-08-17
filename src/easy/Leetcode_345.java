package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-08-17.
 */
public class Leetcode_345 {

    public static String reverseVowels(String s) {

        List<String> vowel = List.of("a","e","i","o","u", "A","E","I","O","U");
        List<String> list = Arrays.stream(s.split(""))
                .filter(i -> vowel.contains(i))
                .collect(Collectors.toList());
        Collections.reverse(list);
        String result = "";
        for (int i = 0, j = 0; i < s.length(); i++) {

            if (vowel.contains( String.valueOf(s.charAt(i)))){
                result += list.get(j);
                j++;
            }else{
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }
}
