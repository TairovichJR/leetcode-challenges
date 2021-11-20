package medium;

/**
 * Created by tairovich_jr on 2021-11-19.
 */
public class SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i!=j && nums[i] == nums[j]) i=i+2;
            }
            res = nums[i];
            break;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1,1,2,3,3}));
    }
}
