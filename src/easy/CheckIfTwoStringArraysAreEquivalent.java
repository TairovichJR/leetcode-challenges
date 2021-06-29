package easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-06-25.
 */
public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String f = "";
        for (int i = 0; i < word1.length; i++) {
            f += word1[i];
        }
        String s = "";
        for (int i = 0; i < word2.length; i++) {
            s += word2[i];
        }
        return f.equals(s);
//        String res1 = Arrays.stream(word1).collect(Collectors.joining());
//        String res2 = Arrays.stream(word2).collect(Collectors.joining());
//        return res1.equals(res2);
    }
}
