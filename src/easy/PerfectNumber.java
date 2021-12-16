package easy;

/**
 * Created by tairovich_jr on 2021-12-15.
 */
public class PerfectNumber {


    public boolean checkPerfectNumber(int num) {

        if (num == 1) return false;
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0){
                sum += i + num/i;
            }
        }
        return ++sum == num;
    }

    public static void main(String[] args) {
        System.out.println(
                new PerfectNumber().checkPerfectNumber(28)
        );

    }

}
