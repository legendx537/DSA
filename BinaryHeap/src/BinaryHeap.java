import java.util.Objects;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        this.arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary heap is Created");
    }

    public boolean isEmpty() {
        return sizeOfTree == 0;
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

    public void levelOrder() {
        for (int i=1; i<=sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapifyBottomToTop(int index,String heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType.equals("MIN")) {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType.equals("MAX")){
               if (arr[index] > arr[parent]) {
                   int temp = arr[index];
                   arr[index] = arr[parent];
                   arr[parent] = temp;
               }
           }
           heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value,String typeHeap) {
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println("The value has been inserted successfully");
    }

    // heapifyTopToBottom
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType.equals("MAX")) {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left]>arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        } else if (heapType.equals("MIN")) {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public void extractHeadOfBP(String heapType) {
        if (isEmpty()) {
            System.out.println("Binary Heap is empty can not extract");
            return;
        } else {
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
        }
    }

    // delete Binary Heap
    public void deleteBH() {
        arr = null;
        System.out.println("Binary Heap is successfully deleted");
    }
}
