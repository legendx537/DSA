public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        lastUsedIndex=0;
        System.out.println("Binary Tree with size " + size + " has been created using array");
    }
}
