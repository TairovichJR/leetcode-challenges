package easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-05-05.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                word += s.charAt(i);
            }
        }
        return word.toLowerCase().equals(new StringBuffer(word).reverse().toString().toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(";"));
    }
}
