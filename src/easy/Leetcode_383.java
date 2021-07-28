package easy;

/**
 * Created by tairovich_jr on 2021-07-27.
 */
public class Leetcode_383 {

    //"aab"
    //"baa"
    public static boolean canConstruct(String ransomNote, String magazine) {

        int leng = ransomNote.length();
        String temp = ransomNote;
        for (int i = 0; i < leng; i++) {
            String c = String.valueOf(temp.charAt(i));
            if (magazine.contains(c)){
                magazine = magazine.replaceFirst(c,"");
                ransomNote = ransomNote.replaceFirst(c, "");
            }
        }
        return ransomNote.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }
}
