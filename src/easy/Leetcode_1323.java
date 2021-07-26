package easy;

/**
 * Created by tairovich_jr on 2021-07-24.
 */
public class Leetcode_1323 {


    public static int maximum69Number (int num) {


        int max = num;
        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length(); i++) {
            int temp = 0;
            Integer n = Integer.parseInt( "3" +  addTrailingZeros( strNum.length() - i - 1 ));

            if (Character.getNumericValue(strNum.charAt(i)) == 9){
                temp = num - n ;
            }
            else{
                temp = num + n;
            }

            if (temp > max){
                max = temp;
            }
        }
        return max;
    }


    public static String addTrailingZeros(int trail){
        String zeros = "";
        for (int i = 0; i < trail; i++) {
            zeros+= "0";
        }
        return zeros.trim();
    }


}
