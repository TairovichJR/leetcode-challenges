package easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-07-23.
 */
public class Leetcode_1844 {

    public static String replaceDigits(String s) {

        Character[] chars =  s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 != 0){
                chars[i] = shift(chars[i-1], Character.getNumericValue( chars[i]));
            }
        }
        return Arrays.stream(chars).map(String::valueOf).collect(Collectors.joining());
    }

    public static char shift(char c, int x){
        int position = c;
        return (char)(position+x);
    }

    public static void main(String[] args) {


        System.out.println( replaceDigits("a1c1e1"));
    }
}
