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

    // Level Order Traversal
    // In case of level order traversal of tree that is implemented using array
    // we just have to iterate over the array
    // because the way they are inserted are level by level only
    public void levelOrder() {
        for (int i=1; i<=lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
