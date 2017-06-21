package training.com.BinaryTrees;

import training.com.Node;

import java.util.Stack;

/**
 * Created by sentinel on 6/12/17.
 */
public class MaxPathTree {

    public int maxSum(Node node){

        int maxSum = Integer.MIN_VALUE;

        if (node == null)
            return 0;

        Stack<Node> s = new Stack<>();

        s.push(node);

        while (!s.isEmpty()){
            Node tmp = s.pop();
            if (tmp.left != null){
                tmp.left.data+=tmp.data;
                s.push(tmp.left);
            }

            if (tmp.right != null){
                tmp.right.data+=tmp.data;
                s.push(tmp.right);
            }

            if (tmp.right == null && tmp.left == null){
                if (maxSum<tmp.data)
                    maxSum = tmp.data;
            }
        }
        return maxSum;
    }

    public int maxSumRec(Node node){

        if (node == null) {
            return 0;
        }


        int left = maxSum(node.left);
        int right = maxSum(node.right);


        return Math.max(left+node.data,right+node.data);
    }

    public static void main(String[] args){
        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node (25);
        root.left.left = new Node (60);
        root.left.right = new Node(17);
        root.right.left = new Node(25);
        root.right.right = new Node(27);

        MaxPathTree mpt = new MaxPathTree();
        //System.out.println(mpt.maxSum(root));


        System.out.println(mpt.maxSumRec(root));
    }
}
