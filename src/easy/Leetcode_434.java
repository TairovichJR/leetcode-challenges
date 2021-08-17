package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-08-11.
 */
public class Leetcode_434 {


    public static int countSegments(String s) {

        return Arrays.stream(s.split(" "))
                .filter(i -> !i.equals(""))
                .toArray(String[]::new).length;
    }

    public static void main(String[] args) {

        System.out.println(countSegments(", , , ,        a, eaefa"));
    }
}
