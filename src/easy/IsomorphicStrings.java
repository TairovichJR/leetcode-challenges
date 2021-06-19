package easy;

import java.util.HashMap;

/**
 * Created by tairovich_jr on 2021-06-07.
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }else{

                Character existing = map.get(s.charAt(i));

                if (existing != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
    }
}
