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

}
