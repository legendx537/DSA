public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
        this.arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary heap is Created");
    }

    public boolean isEmpty() {
        if (sizeOfTree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty");
            return null;
        }
        return arr[1];
    }

    public int sizeOfBH() {
        return sizeOfTree;
    }
}
