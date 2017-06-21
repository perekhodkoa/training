package training.com.BinaryTrees;

import training.com.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sentinel on 6/12/17.
 */
public class RobberTree {

    public int getMaxAmount(Node node){

        Queue<Node> q = new LinkedList<>();

        if (node == null)
            return 0;

        q.add(node);
        int even = 0;
        int odd = 0;
        int currentLevel = 1;

        while (!q.isEmpty()){
            int currentLevelNodes = q.size();
            while (currentLevelNodes>0) {
                Node current = q.remove();

                if (currentLevel % 2 != 0)
                    odd += current.data;
                else
                    even += current.data;

                if (current.left != null) {
                    q.add(current.left);
                }

                if (current.right != null) {
                    q.add(current.right);
                }
                currentLevelNodes--;
            }
            currentLevel++;
        }

        return Math.max(even,odd);

    }

    public static void main(String[] args){
        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node (250);
        root.left.left = new Node (60);
        root.left.right = new Node(17);
        root.right.left = new Node(25);
        root.right.right = new Node(27);

        RobberTree rt = new RobberTree();
        System.out.println(rt.getMaxAmount(root));
    }
}
