package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by tairovich_jr on 2021-08-06.
 */
public class Leetcode_415 {

    public static String addStrings(String num1, String num2) {




        if (num1.length() > num2.length()){
            int diff = num1.length() - num2.length();
            num2 = String.format("%0"+ (num1.length() - num2.length() )+"d%s",0 ,num2);
        }else if(num1.length() < num2.length()){
            int diff = num2.length() - num1.length();
            num1 = String.format("%0"+ (num2.length() - num1.length() )+"d%s",0 ,num1);
        }
        String sum = "";
        int remain = 0;
        for (int i = num1.length()-1; i >= 0; i--) {
             int add = Integer.parseInt(num1.charAt(i)+"") + Integer.parseInt(num2.charAt(i)+"") + remain;
             if (add > 9){
                 sum += add%10;
                 remain = add/10;
             }else{
                 sum += add;
                 remain = 0;
             }
        }
        if (remain > 0) sum = sum + remain;

        return new StringBuilder(sum).reverse().toString();
    }
}









