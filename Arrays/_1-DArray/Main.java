public class Main {

   public static void main(String[] args) {
       
      SingleDimensionalArray singleArray = new SingleDimensionalArray(10);

      singleArray.insert( 1, 1);
      singleArray.insert( 2, 2);
      singleArray.insert( 3, 3);
      singleArray.insert( 120, 120);

      // Access in an array -> O(1)
      try{
         var element1 = singleArray.arr[0];
         var element2 = singleArray.arr[13];
         System.out.println(element1);
         System.out.println(element2);
      }catch (IndexOutOfBoundsException e){
         System.out.println("Index Trying to access is not within the range");
      }

      //Array Traversal -> O(n)
      System.out.println("Array Traversal is -> O(n) Remember");
      singleArray.traversal();

      // Search in an array -> O(n)
      System.out.println(" Search in an array is -> O(n) Remember");
      singleArray.searchInAnArray(1);
      singleArray.searchInAnArray( 78 );

      //Deletion from the array -> O(1)
      System.out.println("Deletion from the array is -> O(1)");
      singleArray.deleteFromAnArray(1);
      singleArray.deleteFromAnArray(14);
      System.out.println( singleArray.arr[1] );




   }
}