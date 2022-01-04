package easy;

/**
 * Created by tairovich_jr on 2021-12-16.
 */
public class ReverseStringII {

    public String reverseStr(String s, int k) {

        StringBuilder builder = new StringBuilder();
        if (s.length() <= k ){
            return builder.append(s).reverse().toString();
        }
      //  s = s + " ";
        String result = "";
        for (int i = 0, j = 0; i < s.length(); i=i+k, j++) {
            if (i + k < s.length()){
                String str = s.substring(i, i + k);
                if (j % 2 == 0) {
                    result += builder.append(str).reverse().toString();
                    builder.delete(0,str.length());
                }else{
                    result += str;
                }
            }else{
                    result += s.substring( s.length() -  ((i+k) - s.length()) );
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStringII().reverseStr("abcd",2));
        System.out.println(2%2);
    }
}
