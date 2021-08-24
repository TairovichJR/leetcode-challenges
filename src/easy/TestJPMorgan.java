package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by tairovich_jr on 2021-08-18.
 */
public class TestJPMorgan {


    public static int[] uniqueArrays(int[] arr1, int[] arr2){

        int[] newArr = new int[arr1.length+arr2.length];
        int count = 0;
        int i = 0;
        int j = 0;
        while ( count < newArr.length){

            if ( i < arr1.length){
              newArr[count] = arr1[i];
              i++;
              count++;
            }
            if (j < arr2.length){
                newArr[count] = arr2[j];
                j++;
                count++;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int k = 0; k < newArr.length; k++) {
            set.add(newArr[k]);
        }
        int[] result = new int[set.size()];

        int c = 0;
        for(Integer item : set){
            result[c] = item;
            c++;
        }

        return result;
    }


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6
        };
        System.out.println(Arrays.toString( uniqueArrays(arr1, arr2)));



    }
}
