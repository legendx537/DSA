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

    // PreOrder Of Binary Tree
    public void preOrder(int index) {
        if(index > lastUsedIndex)
            return;
        System.out.print(arr[index] + " ");
        preOrder(2*index);
        preOrder(2*index+1);
    }
}
