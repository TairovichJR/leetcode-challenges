package easy;

/**
 * Created by tairovich_jr on 2021-06-28.
 */
public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {

        int numBalancedStrings = 0;
        int lCount = 0;
        int rCount = 0;
        for(int i = 0; i < s.length(); ++i)
        {
            char c = s.charAt(i);
            if(c == 'L')
                ++lCount;
            else if(c =='R')
                ++rCount;
            if(lCount == rCount)
            {
                ++numBalancedStrings;
                lCount = 0;
                rCount = 0;
            }
        }
        return numBalancedStrings;
    }

    public static void main(String[] args) {

        System.out.println(new SplitAStringInBalancedStrings().balancedStringSplit("RLLLLRRRLR"));
    }
}
