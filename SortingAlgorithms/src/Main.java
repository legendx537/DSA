public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 15, 6, 17, 8};
//      BubbleSort bS = new BubbleSort();
//      System.out.println("Bubble Sort :-");
//      bS.bubbleSort(arr);
//      bS.printArray(arr);
//
//      System.out.println("Selection Sort :-");
//      SelectionSort.selectionSort(arr);
//      SelectionSort.printArray(arr);

//      System.out.println("Insertion Sort :- ");
//      InsertionSort.insertionSort(arr);
//      InsertionSort.printArray(arr);

//        System.out.println("Bucket Sort :- ");
//        BucketSort bs = new BucketSort(arr);
//        bs.printArray(arr);
//        bs.bucketSort(arr);
//        System.out.println();
//        bs.printArray(arr);

//        System.out.println("Merge Sort :-");
//        MergeSort.mergeSort(arr,0,arr.length-1);
//        MergeSort.printArray(arr);

//        System.out.println("Quick Sort :- ");
//        QuickSort.quickSort(arr,0, arr.length-1);
//        QuickSort.printArray(arr);

        System.out.println("Heap sort :- ");
        HeapSort  hs = new HeapSort(arr);
        hs.heapSort();
        System.out.println();
        System.out.println("Array After Sorting :-");
        hs.printArray(arr);
    }
}