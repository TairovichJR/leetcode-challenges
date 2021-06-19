package easy;

/**
 * Created by tairovich_jr on 2021-06-18.
 */
public class FactorialTrailingZeroes {


    public int trailingZeroes(int n) {

        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public long factorial(int n ){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {

        System.out.println(new FactorialTrailingZeroes().factorial(13));
    }
}
