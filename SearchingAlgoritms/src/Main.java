public class Main {
    public static void main(String[] args) {
      int[] arr = {1, 2, 5, 10, 4, 6};
      System.out.println("Linear Search :- ");
      Searching.linearSearch(arr,10);
      Searching.linearSearch(arr,20);

      System.out.println("Binary Search :- ");
      int[] arr1 = {2, 3, 4, 5, 6, 8, 10};
      Searching.binarySearch(arr1,8);


    }
}