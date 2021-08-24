package easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by tairovich_jr on 2021-08-17.
 */
public class Leetcode_387 {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value+1);
            }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1){
                return  s.indexOf( entry.getKey());
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleetcode"));
    }
}
