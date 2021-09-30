package easy;

import java.util.HashSet;

/**
 * Created by tairovich_jr on 2021-09-29.
 */
public class HasPairWithSome {


    //O(n^2) Time Complexity
    public static boolean hasPairWithSum(int[] arr, int sum){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    //O(n) Time Complexity
    public static boolean hasPairWithSum2(int[] arr, int sum){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains( arr[i])) {
                return true;
            }
            set.add(sum - arr[i]);
        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println(hasPairWithSum2(new int[]{1,2,3,4,7}, 8));
    }
}
