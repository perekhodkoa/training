package training.com.LinkedList;

import training.com.Node;

/**
 * Created by sentinel on 6/26/17.
 */
public class LoopInLinkedList {

    public boolean hasLoop(Node node){

        Node slow = node;
        Node fast = node;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if ( slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        LoopInLinkedList ll = new LoopInLinkedList();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;

        System.out.println(ll.hasLoop(n1));
    }
}
