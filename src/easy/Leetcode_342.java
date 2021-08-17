package easy;

/**
 * Created by tairovich_jr on 2021-08-17.
 */
public class Leetcode_342 {

    public static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }

        if((n % 4) != 0){
            return false;
        }
        return isPowerOfFour(n/4);

    }


    public static void main(String[] args) {

        System.out.println(Math.pow(4,1));

        System.out.println(isPowerOfFour(1) );
    }
}
