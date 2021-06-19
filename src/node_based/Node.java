package node_based;

import java.util.ArrayList;

/**
 * Created by tairovich_jr on 2021-05-25.
 */
public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static int countHead(Node head){

        Node current = head;
        int count = 0;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node nodeA = new Node(2);
        Node nodeB = new Node(3);
        head.setNext(nodeA);
        nodeA.setNext(nodeB);

        int i = countHead(head);
        System.out.println(i);
    }
}





