package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-06-24.
 */
public class SortingTheSentence {

    public String sortSentence(String s) {


        String[] arr = new String[s.split(" ").length];
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String each = split[i];
            arr[ Integer.parseInt( each.substring(each.length()-1)) -1] = each.substring(0, each.length()-1);
        }
        return String.join(" ", arr);
//        return Arrays.stream(s.split(" ")).sorted(Comparator.comparingInt(i -> i.charAt(i.length() - 1)))
//                .collect(Collectors.joining(" ")).replaceAll("[0-9]","");
    }


    public static void main(String[] args) {
        System.out.println(new SortingTheSentence().sortSentence("is2 sentence4 This1 a3"));
    }
}
