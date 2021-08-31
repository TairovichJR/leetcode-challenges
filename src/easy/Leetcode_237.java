package easy;

/**
 * Created by tairovich_jr on 2021-08-30.
 */
public class Leetcode_237 {

    public void deleteNode(ListNode node) {

      node.val = node.next.val;
      node.next = node.next.next;

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
}
