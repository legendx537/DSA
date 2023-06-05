public class BinaryTreeUsingLL {
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

    public void inOrder(BinaryNode node) {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
}
