package easy;

import java.util.Map;

/**
 * Created by tairovich_jr on 2022-03-21.
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {


        for (long i = 1; i*i <=num ; i++) {
            if (i*i == num) return true;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(new ValidPerfectSquare().isPerfectSquare(2147483647));
    }
}
