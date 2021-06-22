package easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-06-22.
 */
public class ShuffleString {

    public String restoreString(String s, int[] indices) {

//        Map<Integer, Character> map = new LinkedHashMap<>();
//        for (int i = 0; i < indices.length; i++) {
//            map.put(indices[i], s.charAt(i));
//        }
//        String collect = map.keySet()
//                .stream().sorted()
//                .map(i -> String.valueOf(map.get(i)))
//                .collect(Collectors.joining(""));
//
//        return  collect;

        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(new ShuffleString().restoreString( "codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
