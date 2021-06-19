package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by tairovich_jr on 2021-06-17.
 */
public class UglyNumber {

    public boolean isUgly(int n) {

        while (n%2 ==0 && n>0){
            n /=2;
        }
        while (n%3 ==0 && n>0){
            n /=3;
        }
        while (n%5 ==0 && n>0){
            n /=5;
        }
        return n==1;
    }


    public static void main(String[] args) {
        System.out.println(new UglyNumber().isUgly(6));

    }
}
