package training.com;

import java.util.*;

/**
 * Created by sentinel on 6/15/17.
 */
public class LowestCommonAncestor {

    public Node findCommonAncestor(Node node, int n1, int n2){

        if (node == null)
            return null;

        if (node.data == n1 || node.data == n2)
            return node;

        Node leftTree = findCommonAncestor(node.left, n1, n2);
        Node rightTree = findCommonAncestor(node.right,n1,n2);

        if (leftTree != null && rightTree !=null)
            return node;
        else
            return (leftTree == null?rightTree:leftTree);

    }

    public  Node findAncestor(Node rootNode, int first, int second)
    {
        if(rootNode == null) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        Node cur = null;
        q.add(rootNode);
        final Map<Node, Node> parents = new HashMap<>();
        final Set<Node> path = new HashSet<>();
        parents.put(rootNode, null);
        boolean firstFound = false;
        boolean secondFound = false;
        while(!q.isEmpty()) {
            cur = q.remove();
            if(cur.left != null) {
                parents.put(cur.left, cur);
                q.offer(cur.left);
            }
            if(cur.right != null) {
                parents.put(cur.right, cur);
                q.add(cur.right);
            }
            if((firstFound || secondFound) && (cur.data == first || cur.data == second)) {
                Node n = cur;
                while(n != null) {
                    if(path.contains(n)) {
                        return n;
                    }
                    n = parents.get(n);
                }
            } else if(cur.data == first || cur.data == second) {
                Node n = cur;
                while(n != null) {
                    path.add(n);
                    n = parents.get(n);
                }
                if(cur.data == first) {
                    firstFound = true;
                } else {
                    secondFound = true;
                }
            }
        }
        return null;
    }


    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        LowestCommonAncestor lca = new LowestCommonAncestor();
        System.out.println(lca.findAncestor(root,3,7).data);
    }
}
