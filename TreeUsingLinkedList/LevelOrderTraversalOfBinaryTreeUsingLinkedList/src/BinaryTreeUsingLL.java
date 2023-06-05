import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeUsingLL {
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.poll();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null )
                queue.offer(presentNode.left);
            if(presentNode.right != null)
                queue.offer(presentNode.right);
        }
    }
}
