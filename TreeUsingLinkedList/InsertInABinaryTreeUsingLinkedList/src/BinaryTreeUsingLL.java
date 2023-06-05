import java.sql.SQLOutput;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeUsingLL {
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

    void levelOrder() {
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

    public void insert(String value) {
        BinaryNode binaryNode = new BinaryNode();
        binaryNode.value = value;
        if(root == null) {
            root = binaryNode;
            System.out.println("Inserted Node at root position");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.poll();
            if(presentNode.left == null) {
                presentNode.left = binaryNode;
                System.out.println("Inserted Node at Left position of " + presentNode.value);
                break;
            } else if(presentNode.right == null) {
                presentNode.right = binaryNode;
                System.out.println("Inserted Node at right position of " + presentNode.value);
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
}

/*
   If the root is null
   Then we will insert at the root position
   Else we will find the first vacant space
   and then insert the node at that position
 */