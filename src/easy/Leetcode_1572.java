package easy;

/**
 * Created by tairovich_jr on 2021-08-31.
 */
public class Leetcode_1572 {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0, j = 0, k = mat.length-1; i < mat.length; i++, j++, k--) {
            sum += (j !=k ) ? mat[i][j] + mat[i][k] :  mat[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {1,2,4,5},
                {1,2,3,8},
                {8,6,1,2}
        };
        System.out.println(diagonalSum(arr));
    }
}
