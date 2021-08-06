package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-07-22.
 */
public class TestQuestion {

    public static List<Integer> split(Integer num, Integer parts){
        List<Integer> list = new ArrayList<>();
        int temp = num % parts;
        for (int i = 0; i < (parts - temp); i++) {
            list.add(num/parts);
        }
        int res = num - list.stream().reduce(0, (a, b) -> a + b);

        for (int i = 0; i < (num % parts); i++) {
            list.add(res/ (num%parts));
        }
        return  list;
    }

    public static boolean isUnique(String str){
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining()).equals(str);
    }

    public static void main(String[] args) {

        System.out.println(0 ^ 0);
    }

}
