package easy;

/**
 * Created by tairovich_jr on 2021-04-23.
 */
public class Implement_strStr {

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) return 0;

        if (!haystack.contains(needle)) return -1;

        return haystack.indexOf(needle);

    }

}
