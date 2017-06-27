package training.com.BinaryTrees;

import training.com.Node;

/**
 * Created by sentinel on 6/21/17.
 *//* Java program to determine if binary tree is
   height balanced or not */

class BalancedTree
{


    Node root;

    /* Returns true if binary tree with root as root is height-balanced */
    boolean isBalanced(Node node)
    {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        if (node == null)
            return true;

        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        return false;
    }

    int height(Node node)
    {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String args[])
    {
        BalancedTree tree = new BalancedTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    //    tree.root.left.left.left = new Node(8);

        if(tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
