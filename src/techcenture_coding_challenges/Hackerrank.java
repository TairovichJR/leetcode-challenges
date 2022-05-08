package techcenture_coding_challenges;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Hackerrank {

    public static long calculateAmount(List<Integer> prices){

        int[] n = new int[prices.size()];
        n[0] = prices.get(0);
        for (int i = 1; i < prices.size(); i++) {

            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {

                Integer current = prices.get(j);
                if (min > current){
                    min = prices.get(j);
                }
            }
            n[i] = Math.max( prices.get(i) - min, 0);
        }
        return Arrays.stream(n).sum();
    }

    public static String longestEvenWord(String sentence){
        String[] split = sentence.split(" ");

        int maxEvenLeng = -1;
        int index = -1;
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (word.length() % 2 == 0 && maxEvenLeng < word.length()){
                maxEvenLeng = word.length();
                index = i;
            }
        }

        if (maxEvenLeng == -1){
            return "00";
        }
        return split[index];
    }

    /**
     *  This method will take 2 string arguments and checks if they are anagram of each other
     *  This method will convert these strings into a char array and then sort it
     *  Then using a for loop, checks if each character appears at the same index in both arrays
     *
     *  Below this solution, there is another solution which is commented out, where it uses a nested
     *  loop to iterate both strings to check if they anagram or not
     *
     * @param str1 first argument
     * @param str2 second argument
     * @return
     */

    public static boolean anagramOfEachOther(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]){
                return false;
            }
        }

        return true;

        //Alternative solution with nested loop
        /*
        if (str1.length() != str2.length()){
            return false;
        }
        //listen silenq
        for (int i = 0; i < str1.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                return false;
            }
        }
        return true;
        */
    }


    /**
     * This method takes a String input in M/d/yyyy format and returns the
     * string in yyyyMMdd format. For that SimpleDateFormatter class
     * @param str
     * @return
     */
    public static String convertDate(String str){
        try {
            Date date=new SimpleDateFormat("M/d/yyyy").parse(str);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String text = sdf.format(date);
            return text;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * This method takes an int called num and returns the sum of numbers between 0 and 1000
     * divisible by 3, 5 or both. It uses a simple for loop and multiple if else conditions
     * @param num
     * @return
     */
    public static int sumOfNumbersDivisible(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
            }
            else if ( i % 3 == 0){
                sum += i;
            }
            else if (i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    /**
     * This method takes a String argument called file which is the location of the json file.
     * Using the Gson dependency, it converts it to JsonReader and Response Object. It uses a for each loop
     * to reap id and display name properties of the json object
     */
//    public static void displayInfo(String file) {
//        Gson gson = null;
//        JsonReader reader = null;
//        try {
//            gson = new Gson();
//            reader = new JsonReader(new FileReader(file));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Response[] responses = gson.fromJson(reader, Response[].class);
//        for (Response r:  responses) {
//            System.out.println("ID: " +  r.getId() + "  |  DISPLAY NAME: " + r.getDisplayName());
//        }
//    }

}
