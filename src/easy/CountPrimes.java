package easy;

/**
 * Created by tairovich_jr on 2021-06-07.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n/2; i++) {
            if (isPrime(i)){
                System.out.println(i);
                count = count + 2;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i < n ; i++) {
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        return  flag;
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(499979));
    }
}
