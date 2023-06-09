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

    public BinaryNode search(BinaryNode node,int value) {
        if(node == null){
            System.out.println("Value " + value + " does not exist in the binary search tree");
            return null;
        } else if (node.value == value) {
            System.out.println("Value " + value + " exist in binary search tree");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }
}

