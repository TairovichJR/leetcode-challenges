package easy;

import java.util.Set;

/**
 * Created by tairovich_jr on 2021-07-22.
 */
public class Leetcode_1684 {

    public int countConsistentStrings(String allowed, String[] words) {


        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            boolean flag = true;
            for (int j = 0; j < w.length(); j++) {
                if (!allowed.contains( String.valueOf(w.charAt(j)) )){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode_1684().countConsistentStrings("ab",
                new String[]{"ad","bd","aaab","baa","badab"}));
    }
}
