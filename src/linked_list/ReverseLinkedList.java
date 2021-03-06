package linked_list;

public class ReverseLinkedList {


    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }


    public static ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode tail = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println((reverseListRecursively(head).next.next.next.val) );

    }

}
