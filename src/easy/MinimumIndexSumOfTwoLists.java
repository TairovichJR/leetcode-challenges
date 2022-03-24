package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tairovich_jr on 2022-03-24.
 */
public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])){
                    map.put(list1[i], (i+j));
                }
            }
        }

        int min = Integer.MAX_VALUE;
        String restaurants = "";
        for (Map.Entry<String, Integer> each : map.entrySet() ) {
            if (each.getValue() < min){
                restaurants = each.getKey() + "-";
                min = each.getValue();
            }else if(each.getValue() == min){
                restaurants += each.getKey() + "-";
            }
        }

        return restaurants.split("-");
    }


    public static void main(String[] args) {
        new MinimumIndexSumOfTwoLists().findRestaurant(new String[]{"k","KFC"},
                new String[]{"k","KFC"});
    }
}
