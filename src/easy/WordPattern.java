package easy;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by tairovich_jr on 2021-11-21.
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        String[] split = s.split(" ");






        return false;
    }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("aba", "dog cat cat"));
    }
}
