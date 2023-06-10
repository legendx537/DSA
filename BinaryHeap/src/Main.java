public class Main {
    public static void main(String[] args) {
        BinaryHeap bH = new BinaryHeap(5);
        bH.insert(10,"MIN");
        bH.insert(5,"MIN");
        bH.insert(15,"MIN");
        bH.insert(1,"MIN");
        System.out.println(bH.peek());
        System.out.println(bH.sizeOfBH());
        bH.levelOrder();
    }
}
