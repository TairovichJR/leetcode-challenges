package linked_list;


/**
 * Created by tairovich_jr on 2021-07-29.
 */
public class Leetcode_1290 {

    public int getDecimalValue(ListNode head) {

        String binary = "";
        while (head != null){
            String value = String.valueOf(head.val);
            binary += value;
            head = head.next;
        }

        return Integer.parseInt(binary,2);
    }

}

