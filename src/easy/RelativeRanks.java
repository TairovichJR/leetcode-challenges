package easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by tairovich_jr on 2021-12-13.
 */
public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {

        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[] sorted = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], i<3 ? medals[i] : String.valueOf((i + 1)));
        }
        return IntStream.range(0, score.length).mapToObj(i -> map.get(score[i])).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new RelativeRanks().findRelativeRanks(new int[]{10, 3, 8, 9, 4}))
        );
    }
}
