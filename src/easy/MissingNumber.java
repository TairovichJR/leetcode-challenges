package easy;


import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-06-19.
 */
public class MissingNumber {

    public int missingNumber2(int[] nums) {
        return (nums.length * (nums.length + 1))/2 - Arrays.stream(nums).sum();
    }


    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =(n * (n + 1))/2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber2(new int[]{0,1,2,4}));
    }
}
