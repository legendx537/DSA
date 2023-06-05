import java.util.Queue;
import java.util.LinkedList;
public class BinaryTreeUsingLL {
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

   public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.poll();
            if(presentNode.value.equals(value)) {
                System.out.println("The value " + value + " is present n the tree");
                return;
            }

            if(presentNode.left != null)
                queue.offer(presentNode.left);
            if(presentNode.right != null)
                queue.offer(presentNode.right);
        }
       System.out.println("The value " + value + " is not present in the tree");
   }
}

/*
  Please remember that queue performs better than stack
  that is why we have used levelOrder Traversal
 */
