package easy;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentence {

    public int mostWordsFound(String[] sentences) {


//        int max = 0;
//        for (int i = 0; i < sentences.length; i++) {
//            String each = sentences[i];
//            int length = each.split(" ").length;
//            if (length > max){
//                max = length;
//            }
//        }
//        return max;

        return Arrays.stream(sentences).mapToInt(i -> i.split(" ").length).max().getAsInt();

    }

    public static void main(String[] args) {


        String[] sentence = {"alice goes here","hi there"};

    }
}
