import java.util.Objects;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        lastUsedIndex=0;
        System.out.println("Binary Tree with size " + size + " has been created using array");
    }

    private boolean isFull() {
        if(arr.length-1 == lastUsedIndex)
            return true;
        return false;
    }

    public void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Successfully Inserted Node at " + lastUsedIndex );
        }else {
            System.out.println("The BT is full");
        }
    }

    // We will be implementing search in a binary tree
    // using levelOrder Traversal
    public int search(String value) {
        for (int i=1; i<=lastUsedIndex; i++) {
            if (Objects.equals(arr[i], value)) {
                System.out.println(value+ " is found at position " + i);
                return i;
            }
        }
        System.out.println("The value " + value + " does not exit in Binary Tree");
        return -1;
    }

    // Search the node to be deleted
    // if the node does not exist then return directly
    // if the node exist then replace the value with the deepest node
    // which is the last node in the level order traversal
    // then delete the deepest node.
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        }else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The Node with value " + value + " is deleted successfully");
        }
    }

    // revising level order
    // in case of array
    public void levelOrder() {
        for(int i=1; i<=lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
