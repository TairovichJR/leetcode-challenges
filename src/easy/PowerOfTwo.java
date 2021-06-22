package easy;

/**
 * Created by tairovich_jr on 2021-06-20.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if (n == 0) return  false;
        if (n == 1) return true;

        while (n % 2 == 0){
            n = n / 2;
            if (n == 0 || n == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(new PowerOfTwo().isPowerOfTwo(2147483647) );
        System.out.println(Math.pow(2,24));
    }

}
