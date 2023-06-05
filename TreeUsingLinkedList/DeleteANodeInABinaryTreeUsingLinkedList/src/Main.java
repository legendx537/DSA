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
      binaryTree.delete("N3");
      System.out.println();
      binaryTree.levelOrder();
    }
}