package easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tairovich_jr on 2021-04-21.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        int shortest = Arrays.stream(strs).mapToInt( i -> i.length()).sorted().findFirst().getAsInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            for (int j = 1; j <= shortest; j++) {
                String pref = strs[i].substring(0, j);
                System.out.println(pref);
                if (map.containsKey(pref)){
                    Integer val = map.get(pref);
                    map.put(pref, val+1);
                }else{
                    map.put(pref, 1);
                }
            }
        }
        Map<String, Integer> filteredMap = map.entrySet()
                .stream()
                .filter(i -> i.getValue() == strs.length)
                .collect(Collectors.toMap(i -> i.getKey(), i -> i.getValue()));
        if (filteredMap.size() < 1){
            return "";
        }
        return filteredMap.keySet().stream().max(Comparator.comparingInt(String::length)).orElse("");
    }

    public static void main(String[] args) {

        System.out.println( longestCommonPrefix(new String[]{""}));
    }
}
