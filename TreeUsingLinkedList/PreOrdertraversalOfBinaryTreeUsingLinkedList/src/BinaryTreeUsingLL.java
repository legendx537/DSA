public class BinaryTreeUsingLL {
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
