package easy;

/**
 * Created by tairovich_jr on 2021-06-22.
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {

        int prod = 1, sum = 0;
        while (n != 0){
            int rem = n%10;
            prod = prod * rem;
            sum = sum + rem;
            n = n / 10;
        }
        return Math.abs(prod - sum);
    }

    public static void main(String[] args) {
        System.out.println(new SubtractTheProductAndSumOfDigitsOfAnInteger().subtractProductAndSum(234));
    }
}
