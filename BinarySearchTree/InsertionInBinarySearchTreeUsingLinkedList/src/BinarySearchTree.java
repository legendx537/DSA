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
        insert(root,value);
    }

    // If the root is null , then insert the new Node at the root position
    // Otherwise compare with the parent's node
    // if the value is less or Equal of currentNode's left , then insert the node at left
    // Otherwise insert the node in the currentNode's right
}
