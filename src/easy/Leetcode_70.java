package easy;

/**
 * Created by tairovich_jr on 2021-07-28.
 */
public class Leetcode_70 {

    public static int climbStairs(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        int n1 = 2;
        int n2 = 1;
        int all = 0;

        for (int i = 2; i < n; i++) {

            all = n1 + n2;
            n2 = n1;
            n1 = all;
        }

        return all;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
