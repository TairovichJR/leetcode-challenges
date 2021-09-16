package easy;

/**
 * Created by tairovich_jr on 2021-09-14.
 */
public class Leetcode_206 {


    public static ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);

        head.next = one;
        one.next = two;
        two.next = three;

        reverseList(head);



    }
     static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


}
