package easy;

/**
 * Created by tairovich_jr on 2021-06-06.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        while (n != 1){
            if (n == 4){
                return false;
            }
            n = transform(n);
        }
        return  true;
    }

    public int transform(int n ){
        int sum = 0;
        while (n != 0){
            int r = n % 10;
            sum += r * r;
            n = n / 10;
        }
        return sum;
    }
}
