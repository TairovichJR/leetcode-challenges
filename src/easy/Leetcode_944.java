package easy;

/**
 * Created by tairovich_jr on 2021-07-29.
 */
public class Leetcode_944 {

    public static int minDeletionSize(String[] strs) {

        int delete = 0;
        for (int i = 0; i < strs.length; i++) {

            String grid = strs[i];
            for (int j = 0; j < grid.length()-1; j++) {
                int diff = ((int) grid.charAt(j+1) - 97) - ( (int) grid.charAt(j) - 97);
                if (diff < 0 || diff > 1 ){
                   delete++;
                   break;
                }
            }
        }
        return delete;
    }


    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"cba","daf","ghi"}));
    }
}
