public class Main {
    public static void main(String[] args) {
      BinaryTreeUsingLL binaryTree=new BinaryTreeUsingLL();
      binaryTree.insert("N1");
      binaryTree.insert("N2");
      binaryTree.insert("N3");
      binaryTree.insert("N4");
      binaryTree.insert("N5");
      binaryTree.insert("N6");
      binaryTree.levelOrder();
      System.out.println();
      System.out.println(binaryTree.root.value);
      System.out.println();
      binaryTree.deleteBT();
      System.out.println();
      System.out.println(binaryTree.root);
    }
}