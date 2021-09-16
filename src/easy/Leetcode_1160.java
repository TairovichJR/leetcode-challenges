package easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-09-01.
 */
public class Leetcode_1160 {

    public static int countCharacters(String[] words, String chars) {


        String result = "";
        for (int i = 0; i < words.length; i++) {
            boolean flag = false;
            for (int j = 0; j < words[i].length(); j++) {

                if (chars.contains( String.valueOf(words[i].charAt(j)) )){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if (flag){
                result += words[i];
            }
        }
        return result.length();
    }
}
