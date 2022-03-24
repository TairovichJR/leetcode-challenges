package easy;

import java.util.Arrays;


/**
 * Created by tairovich_jr on 2022-03-24.
 */
public class DistributeCandies {


    public int distributeCandies(int[] candyType) {
        int count = (int)Arrays.stream(candyType).distinct().count();
        int half = candyType.length/2;
        return (count>=half) ? half : (half>count)?count : 0;
    }

    public static void main(String[] args) {

        new DistributeCandies().distributeCandies(new int[]{1,1,1,1,2,2,2,3,3,3});
    }
}
