package linked_list;

/**
 * Created by tairovich_jr on 2022-01-04.
 */
public class IntersectionOfTwoLinkedLists {


    public int getCount(ListNode head){
        int count = 0;
        while (head!= null){
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int aLen = getCount(headA);
        int bLen = getCount(headB);

        if (aLen > bLen){
            while (aLen != bLen){
                headA = headA.next;
                bLen++;
            }
        }
        else if (aLen < bLen){
            while (aLen != bLen){
                headB = headB.next;
                aLen++;
            }
        }

        ListNode tempA = headA;
        ListNode tempB = headB;
        while ( tempA!= null && tempB!= null){
            if (tempA.val == tempB.val && tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }

    private static class ListNode{ int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
