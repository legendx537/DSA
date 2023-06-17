public class Main {
    public static void main(String[] args) {
      int[] arr = {10, 5, 15, 6, 17};
//      BubbleSort bS = new BubbleSort();
//      System.out.println("Bubble Sort :-");
//      bS.bubbleSort(arr);
//      bS.printArray(arr);
//
//      System.out.println("Selection Sort :-");
//      SelectionSort.selectionSort(arr);
//      SelectionSort.printArray(arr);

      System.out.println("Insertion Sort :- ");
      InsertionSort.insertionSort(arr);
      InsertionSort.printArray(arr);
    }
}