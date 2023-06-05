public class BinaryTreeUsingLL {
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

    public void postOrder(BinaryNode node) {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
