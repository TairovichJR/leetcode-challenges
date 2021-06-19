package easy;

/**
 * Created by tairovich_jr on 2021-06-07.
 */
public class AddDigits {

    //                      38
    public static int addDigits(int num) {

        if (num < 10) return num;

        while (true){
            int sum = 0;
            while (num != 0){
                int r = num % 10;
                sum += r;
                num = num / 10;
            }
            if (sum < 10){
                return sum;
            }
            num = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
