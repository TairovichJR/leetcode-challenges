package easy;

/**
 * Created by tairovich_jr on 2021-06-21.
 */
public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}
