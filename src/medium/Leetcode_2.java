package medium;

import java.util.LinkedList;

/**
 * Created by tairovich_jr on 2021-07-31.
 */
public class Leetcode_2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String num1 = "";
        while (l1 != null){
            int val = l1.val;
            num1+= val;
            l1 = l1.next;
        }
        String num2 = "";
        while (l2 != null){
            int val = l2.val;
            num2 += val;
            l2 = l2.next;
        }

        if (num1.length() > num2.length()){
            int leng = num1.length() - num2.length();
            for (int i = 0; i < leng; i++) {
                num2 += "0";
            }
        }else if(num1.length() < num2.length()){
            int leng = num2.length() - num1.length();
            for (int i = 0; i < leng; i++) {
                num1 += "0";
            }
        }
        String sum = "";
        int remain = 0;
        for (int i = 0; i < num1.length(); i++) {
            int add = Integer.parseInt(num2.charAt(i) + "") + Integer.parseInt(num1.charAt(i)+"") + remain;
            if (add > 9){

                sum += add%10;
                remain = add/10;
            }else{
                sum += add;
                remain = 0;
            }
        }
        if (remain > 0){
            sum += remain;
        }
        ListNode head = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(0))));
        for (int i = 1; i < sum.length(); i++) {
            int data = Integer.parseInt(String.valueOf(sum.charAt(i)));
            insertLast(head, data);

        }
        return head;
    }

    public static void insertLast(ListNode head, int data){
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        ListNode temp2 = new ListNode(data);
        temp.next = temp2;
    }


    public static void main(String[] args) {


        ListNode head1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        head1.next = node1;
        node1.next = node2;

        ListNode head2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);

        head2.next = node3;
        node3.next = node4;



        ListNode listNode = addTwoNumbers(head1, head2);

        while (listNode != null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }

//        System.out.println(12%10);

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
