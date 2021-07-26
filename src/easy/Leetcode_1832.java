package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tairovich_jr on 2021-07-24.
 */
public class Leetcode_1832 {

    public boolean checkIfPangram(String sentence) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }

        return set.size() >= 26 ? true : false;
    }


    public static void main(String[] args) {



        String s = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        String[] split = s.split("");
        String distinct = Arrays.stream(split).distinct().sorted().collect(Collectors.joining());

        System.out.println(distinct);
    }
}
