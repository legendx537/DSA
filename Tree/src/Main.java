public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        drinks.add(hot);
        drinks.add(cold);
        hot.add(tea);
        hot.add(coffee);
        cold.add(wine);
        cold.add(beer);
        System.out.println(drinks.print(0));
    }
}