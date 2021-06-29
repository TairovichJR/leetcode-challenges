package easy;

/**
 * Created by tairovich_jr on 2021-06-28.
 */
public class CountOfMatchesInTournament {

    public int numberOfMatches(int n) {

        int result = 0;
        while (n != 1){
            if (n % 2 == 0){
                n = n / 2;
                result += n;
            }else{
                n = n / 2;
                result += n;
                n+=1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountOfMatchesInTournament().numberOfMatches(7));
    }
}
