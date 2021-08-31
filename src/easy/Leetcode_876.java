package easy;

import javax.swing.*;
import java.util.List;

/**
 * Created by tairovich_jr on 2021-08-30.
 */
public class Leetcode_876 {

    public static ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count % 2 == 0){
            count = count/2;
        }else{
            count = count/2 + 1;
        }
        temp = head;
        count--;
        while (count != 0){
            temp = temp.next;
            count--;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
//        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;

        System.out.println(middleNode(head).val);

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
