package linked_list;

/**
 * Created by tairovich_jr on 2022-01-04.
 */
public class RemoveLinkedListElements {



    public ListNode removeElements(ListNode head, int val) {

        // [1,2,6,3,4,5,6]
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode sentinel = prev;

        while(head != null){
            if(head.val == val){
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        new RemoveLinkedListElements().removeElements(node1, 6);

    }


    private static class ListNode {

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
