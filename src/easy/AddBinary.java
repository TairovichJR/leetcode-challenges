package easy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by tairovich_jr on 2021-04-25.
 */
public class AddBinary {


    public static String addBinary(String a, String b) {

        int min = Math.abs(a.length()-b.length());
        String zeros = "";
        for (int i = 0; i < min; i++) {
            zeros += "0";
        }

        if(a.length() > b.length()){
            b = zeros + b;
        }
        if (a.length() < b.length()){
            a = zeros + a;
        }

        String result = "";
        String carryOver = "0";
        for (int i = a.length(); i > 0; i--){

            int dec_1 = Integer.parseInt(a.substring(i-1, i),2);
            int dec_2 = Integer.parseInt(b.substring(i-1, i),2);
            int sum = (dec_1 + dec_2 + Integer.parseInt(carryOver,2));
            String binary = Integer.toBinaryString(sum);
            if (binary.length() > 1){
                result += binary.substring(1,2);
                carryOver = binary.substring(0,1);
            }else{
                result += binary;
                carryOver = "0";
            }
        }
        if (!carryOver.isEmpty() && !carryOver.equals("0")){
            result += carryOver;
        }

        return Stream.of(result.split("")).reduce("", (reversed, character) -> character + reversed);
    }

    public static void main(String[] args) {


        System.out.println(Math.pow(0,2));
        System.out.println(addBinary("1",
                "111"));
    }
}
