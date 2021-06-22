package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tairovich_jr on 2021-06-22.
 */
public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new KidsWithTheGreatestNumberOfCandies().kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }
}
