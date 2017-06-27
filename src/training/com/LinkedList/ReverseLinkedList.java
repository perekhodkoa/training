package training.com.LinkedList;

import training.com.Node;

/**
 * Created by sentinel on 6/12/17.
 */
public class ReverseLinkedList {

    public Node reverseIteratively(Node node){
        Node current = node;
        Node prev = null;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node reverseRecursively(Node node){

        if (node == null || node.next == null)
            return node;

        Node revisedHead = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;

        return revisedHead;
    }

    public static void main(String[] args){
        ReverseLinkedList rll = new ReverseLinkedList();
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);

        Node n = rll.reverseIteratively(root);
        while (n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println();
        root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        n = rll.reverseRecursively(root);
        while (n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
