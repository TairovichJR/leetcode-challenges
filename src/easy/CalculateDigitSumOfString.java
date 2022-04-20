package easy;

import java.util.Arrays;

public class CalculateDigitSumOfString {

    public static String digitSum(String s, int k) {

        while (s.length() > k){
            String str = "";
            for (int i = 0; i < s.length(); ) {
                int num = 0;
                int lim = Math.min(s.length(), i+k);
                while (i != lim){
                    num += s.charAt(i++) - '0';
                }
                str += String.valueOf(num);
            }
            s = str;
        }
        return s;
    }

    public static void main(String[] args) {


        System.out.println(digitSum("233", 8));

    }
}
