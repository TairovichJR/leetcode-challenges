package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tairovich_jr on 2021-07-27.
 */
public class Leetcode_409 {

    public static int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey( Character.valueOf( s.charAt(i) ) )){
                map.put(Character.valueOf(s.charAt(i)),1);
            }else{
                Integer value = map.get(Character.valueOf(s.charAt(i)));
                map.put(Character.valueOf(s.charAt(i)), value+1);
            }
        }
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0){
                count += entry.getValue();
            }else{
                list.add(entry.getValue());
            }
        }

        int asInt = list.stream().mapToInt(x -> x).max().orElse(0);
        boolean fl = true;
        if (list.size() == 1){
            count += list.get(0);
        }else{
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) == asInt && fl){
                    count+= list.get(i);
                    fl =false;
                }else{
                    count += list.get(i) - 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));
    }
}
