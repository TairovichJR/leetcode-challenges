package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by tairovich_jr on 2021-07-23.
 */
public class Leetcode_804 {

    public static int uniqueMorseRepresentations(String[] words) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String morseWord = "";
            for (int j = 0; j < words[i].length(); j++) {
                int pos = (int)(words[i].charAt(j) - 97);
                morseWord += morse[pos];
            }
            set.add(morseWord);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }

}
