package easy;

import java.util.Arrays;

/**
 * Created by tairovich_jr on 2021-07-24.
 */
public class Leetcode_1309 {


    public static String freqAlphabets(String s) {

        String encoded = s;
        String result = "";
        while (encoded.contains("#")){
            int index = encoded.indexOf("#");
            String extract = encoded.substring(index-2, index+1);
            encoded = encoded.replaceFirst(extract,
                    String.valueOf( (char) (Integer.parseInt(extract.replace("#","")) + 96) ));
        }

        for (int i = 0; i < encoded.length(); i++) {
            if (Character.isDigit(encoded.charAt(i))){
                String c = String.valueOf(encoded.charAt(i));
                result+= (char)(Integer.parseInt(c)+96);
            }else{
                result += encoded.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(2 ^ 5 ^ 6);
    }

}
