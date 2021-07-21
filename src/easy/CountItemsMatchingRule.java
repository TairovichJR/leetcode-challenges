package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by tairovich_jr on 2021-07-21.
 */
public class CountItemsMatchingRule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")){
                String type = items.get(i).get(0);
                if (type.equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey.equals("color")){
                String color = items.get(i).get(1);
                if (color.equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey.equals("name")){
                String name = items.get(i).get(2);
                if(name.equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(new CountItemsMatchingRule().countMatches(Arrays.asList(List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone")), "color", "silver"));
    }
}
