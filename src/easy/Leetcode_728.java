package easy;

import java.util.*;

/**
 * Created by tairovich_jr on 2021-09-19.
 */
public class Leetcode_728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            String s = String.valueOf(i);
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {

                Integer digit = Integer.valueOf(String.valueOf(s.charAt(j)));

                if ( digit != 0 && i % digit == 0 ){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if (flag) list.add( i );
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }
}
