import BinaryHeapMethods.BinaryHeap;
public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void heapSort() {
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i=0; i< arr.length; i++) {
            bh.insert(arr[i], "MIN");
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = bh.extractHeadOfBP("MIN");
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
