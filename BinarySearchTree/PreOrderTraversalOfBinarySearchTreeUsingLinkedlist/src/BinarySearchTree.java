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

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

/*
   PreOrder - Root Left Right
   First we will print the Root value
   then we will call the method for left subtree
   then we will call the method for right subtree
 */
