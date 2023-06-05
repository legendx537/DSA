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

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.poll();
            if(presentNode.left != null)
                queue.offer(presentNode.left);
            if(presentNode.right != null)
                queue.offer(presentNode.right);
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.offer(root);
        BinaryNode previousNode , presentNode = null;
        while(!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.poll();
            if(presentNode.left == null) {
                previousNode.right = null;
            }else if(presentNode.right == null) {
                presentNode.left = null;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // delete a Node
    public void delete(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.poll();
            if(presentNode.value.equals(value)) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Succesfully Deleted");
                break;
            }
            if(presentNode.left != null) queue.offer(presentNode.left);
            if(presentNode.right != null) queue.offer(presentNode.right);
        }
        System.out.println("node does not exit in the Binary Tree");
    }
}

/*
   For Deleting a node in a binary tree
   We need to do 4 steps
   Step 1 :- Find the node
   Step 2 :- Find Deepest node
   Step 3 :- Set the deepest node value to the current node
   Step 4 :- Delete Deepest Node
 */