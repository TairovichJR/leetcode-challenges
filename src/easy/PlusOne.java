package easy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by tairovich_jr on 2021-04-24.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {

       int last = digits[digits.length-1];

       if (last < 9){
           digits[digits.length-1] = last+1;
           return digits;
       }

       int index = digits.length-1;
       int remain = 0;
       while (index >= 0){
           if (digits[index] == 9){
               digits[index] = 0;
               remain = 1;
           }else{
               digits[index]++;
               return digits;
           }
           index--;
       }
       if (remain == 1){
           int[] newArr = new int[digits.length+1];
           newArr[0] = 1;
           System.arraycopy(digits, 0, newArr,1, digits.length);
           return newArr;
       }
       return null;

    }

    public static void main(String[] args) {

        System.out.println( Arrays.toString(plusOne(new int[]{1})));


    }
}
