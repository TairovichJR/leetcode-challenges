package easy;

/**
 * Created by tairovich_jr on 2021-06-22.
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
}
