package easy;

/**
 * Created by tairovich_jr on 2021-12-16.
 */
public class DetectCapital {

    public boolean detectCapital(String word){

        if (word.toUpperCase().equals(word) || word.toLowerCase().equals(word)
        || word.substring(1).toLowerCase().equals(word.substring(1))){
            return true;
        }
        return false;
    }
}
