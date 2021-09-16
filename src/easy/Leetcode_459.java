package easy;

/**
 * Created by tairovich_jr on 2021-09-15.
 */
public class Leetcode_459 {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }
    public static boolean repeatedSubstringPattern(String s) {

        int length = s.length();
        for (int i = 1; i <= length/2; i++) {

            String sub = s.substring(0,i);
            if ( length % sub.length() == 0){
                String str = "";
                int count = length/sub.length();
                str = sub.repeat(count);

                if (s.equals(str)) return true;
            }
        }
        return false;

        //older solution but takes longer time
//        for (int i = 0; i < s.length()-1; i++) {
//            String sub = s.substring(0, i+1);
//            String result = "";
//
//            while (result.length() < s.length()){
//                result += sub;
//            }
//            if (result.equals(s)) return true;
//        }
//        return false;
    }
}
