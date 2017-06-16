package training.com;

import java.util.HashMap;

import static com.sun.tools.doclint.Entity.le;
import static com.sun.tools.doclint.Entity.sum;

/**
 * Created by sentinel on 6/14/17.
 */
public class HaircutTree {

    public int cutIt(Node node, int level, int cutto){
        if (node == null){
            return 0;
        }

        int sumLeft = cutIt(node.left, level+1,cutto);
        int sumRight = cutIt(node.right,level+1,cutto);

        if (level == cutto){
            node.data += sumLeft+sumRight;
            node.left = null;
            node.right = null;
            return 0;
        }

        return sumLeft+sumRight+node.data;
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node(25);
        root.left.left = new Node(60);
        root.left.right = new Node(17);
        root.right.left = new Node(25);
        root.right.right = new Node(27);

        HaircutTree hc = new HaircutTree();
        hc.cutIt(root,0,2);

        System.out.println();
    }

}
