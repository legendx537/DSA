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
    public BinaryNode minimumNode(BinaryNode node) {
        if (node.left == null) {
            return node;
        } else {
            return minimumNode(node.left);
        }
    }

    public BinaryNode delete(BinaryNode root,int value) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = delete(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }

        return root;
    }


}


