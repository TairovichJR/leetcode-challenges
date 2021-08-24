package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-08-24.
 */
public class DicksSporting_Codility {

    public static String solution(String S, String C){
        final String[] newNames = Arrays.stream(S.split(";"))
                .map( i -> {
                    String[] fullName = i.trim().toLowerCase().replace("-","").split(" ");
                    return fullName.length>2 ?
                            fullName[0] + "." + (fullName[2].length() > 8 ? fullName[2].substring(0, 8) : fullName[2]) :
                            fullName[0] + "." + (fullName[1].length() > 8 ? fullName[1].substring(0, 8) : fullName[1]);
                }).toArray(String[]::new);

        final List<String> list = new ArrayList<>();
        Arrays.stream(newNames).forEach( item -> {
            if(!list.contains(item)){
                list.add(item);
            }else{
                long count = list.stream().filter(k -> k.contains(item)).count();
                list.add(item + (count+1));
            }
        });
        return list.stream().map(item -> item + "@" + C.toLowerCase() + "; ").collect(Collectors.joining()).trim();
    }

    public static void main(String[] args) {
        System.out.println(solution("John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker","Example"));
    }
}
