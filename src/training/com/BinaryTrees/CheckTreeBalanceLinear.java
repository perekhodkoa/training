package training.com.BinaryTrees;

import training.com.Node;

/**
 * Created by sentinel on 6/26/17.
 */
public class CheckTreeBalanceLinear {

    Node root;

    public int checkHeight(Node node){

        if (node == null)
            return -1;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heigthDiff = Math.abs(leftHeight-rightHeight);

        if (heigthDiff>1)
            return Integer.MIN_VALUE;
        else
            return Math.max(leftHeight,rightHeight)+1;

    }

    public boolean isBalanced(Node node){
        return checkHeight(node) != Integer.MIN_VALUE;
    }

    public static void main(String args[])
    {
        CheckTreeBalanceLinear tree = new CheckTreeBalanceLinear();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  //      tree.root.left.left.left = new Node(8);

        if(tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
