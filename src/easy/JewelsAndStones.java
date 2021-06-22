package easy;

/**
 * Created by tairovich_jr on 2021-06-21.
 */
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelsArr = jewels.toCharArray();
        char[] stoneArr = stones.toCharArray();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stoneArr.length; j++) {
                if (jewelsArr[i] == stoneArr[j]){
                    count++;
                }
            }
        }
       return  count;
    }

    public static void main(String[] args) {
        System.out.println(new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
    }
}
