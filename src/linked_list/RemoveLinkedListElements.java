package linked_list;

/**
 * Created by tairovich_jr on 2022-01-04.
 */
public class RemoveLinkedListElements {



    public ListNode removeElements(ListNode head, int val) {

        ListNode current = head;
        ListNode prev = null;
        int count = 0;
        while (current != null){
            if (current.val == val && count > 0){
                prev.next = current.next;
            }else{
                prev = current;
            }
            count++;
            current = current.next;
        }

        if (head != null && head.val == val){
            head = head.next;
        }
        return head;
    }

    public ListNode removeElementsRecursively(ListNode head, int val) {

        if (head == null){
            return head;
        }
        head.next = removeElements(head.next, val);
        return (head.val == val) ? head.next : head;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
//        ListNode node4 = new ListNode(7);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(5);
//        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;

        new RemoveLinkedListElements().removeElements(node1, 2);

    }




}
