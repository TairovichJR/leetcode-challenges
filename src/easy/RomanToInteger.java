package easy;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by tairovich_jr on 2021-04-21.
 */
public class RomanToInteger {

    public static int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] split = s.split("");
        int result = (s.length() < 1) ? 0 : map.get(split[0]);
        for (int i = 1; i < split.length; i++) {

            int prev = map.get(split[i-1]);
            int current = map.get(split[i]);

            if (current <= prev){
                result += current;
            }else{
                result = result - prev;
                result = result + (current-prev);
            }
        }
        return result;
    }
}
