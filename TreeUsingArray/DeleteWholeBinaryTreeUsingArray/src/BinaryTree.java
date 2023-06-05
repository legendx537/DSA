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

    // For Deleting Whole Binary Tree
    // We have to set the array to null
    // means delete  all its values
    public void deleteBT() {
        try {
            arr = null;
            System.out.println("The BT is deleted successfully");
        }catch (Exception e) {
            System.out.println("There is an error while deleting Binary tree");
        }
    }
}
