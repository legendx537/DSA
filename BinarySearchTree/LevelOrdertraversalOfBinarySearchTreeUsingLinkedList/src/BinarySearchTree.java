import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {
        root = null;
        System.out.println("BST is created successfully");
    }
    
    private BinaryNode insert(BinaryNode currentNode,int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The Node is inserted successfully");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left , value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right , value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root,value);
    }

    public void levelOrder(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
    }
}

