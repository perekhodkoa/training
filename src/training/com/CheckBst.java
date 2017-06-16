package training.com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sentinel on 6/11/17.
 */
public class CheckBst {


    public boolean checkBSTIterrative(Node node){

        if (node == null)
            return true;

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()){

            Node tmp = q.remove();

            if (tmp.left != null){
                if (tmp.data < tmp.left.data)
                    return false;
                q.add(tmp.left);
            }

            if (tmp.right != null){
                if (tmp.data >= tmp.right.data)
                    return false;
                q.add(tmp.right);
            }
        }

        return true;
    }

    public boolean checkBSTRecursively(Node node, int min, int max){

        if (node == null)
            return true;

        if (node.data < min || node.data >=max ) return false;

        return checkBSTRecursively(node.left, min, node.data-1) || checkBSTRecursively(node.right, node.data+1, max);


    }

    public static void main(String[] args){

        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node (25);
        root.left.left = new Node (10);
        root.left.right = new Node(17);
        root.right.left = new Node(25);
        root.right.right = new Node(27);

        CheckBst cb = new CheckBst();
        System.out.println("Checking BST Iteratively:");
        System.out.println(cb.checkBSTIterrative(root));
        System.out.println("Checking BST Recursively:");
        System.out.println(cb.checkBSTRecursively(root,Integer.MIN_VALUE, Integer.MAX_VALUE));

    }
}
