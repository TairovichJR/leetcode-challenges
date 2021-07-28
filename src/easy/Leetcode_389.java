package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-07-26.
 */
public class Leetcode_389 {


    public static char findTheDifference(String s, String t) {

//        List<Character> tList = Arrays.stream(t.split("")).map(i -> i.charAt(0)).collect(Collectors.toList());
//        for (int i = 0; i < s.length(); i++) {
//            if (tList.contains( s.charAt(i)) ){
//                tList.remove( Character.valueOf(s.charAt(i)) );
//            }
//        }
//        return tList.get(0);

        String collect = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        String collect2 = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
        return collect2.replace(collect,"").charAt(0);
    }

    public static void main(String[] args) {


        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
