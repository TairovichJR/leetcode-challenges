package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tairovich_jr on 2021-05-01.
 */
public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> parent = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> child = new ArrayList<>();
            int[] inner = new int[i];
            inner[0] = 1;
            inner[inner.length - 1] = 1;

            for (int n : inner) {
                child.add(n);
            }
            parent.add(child);

            List<Integer> currentChild = parent.get(i - 1);

            if (currentChild.size() > 1) {
                List<Integer> previousChild = parent.get(i - 2);
                for (int j = 0; j < previousChild.size() - 1; j++) {
                    currentChild.set(j + 1, previousChild.get(j) + previousChild.get(j + 1));
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {

        System.out.println(generate(5));
    }
}
