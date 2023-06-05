public class SingleDimensionalArray {

    int[] arr;
    public SingleDimensionalArray(int size) {
       arr = new int[size];
       for(int i=0; i < size; i++){
           arr[i] = Integer.MIN_VALUE;
       }
    }

    // Insertion at end is O(1)
    public void insert(int location, int value) {
       try{
           if( arr[location] == Integer.MIN_VALUE) {
               arr[location] = value;
               System.out.println("Inserted Successfully");
           }else{
               System.out.println("Index is already occupied");
           }
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid Index to access");
       }
    }

    public void traversal() {
        try {
            for (int j : arr) {
                System.out.println(j + " ");
            }
        } catch(RuntimeException e){
            System.out.println("Array does not exist");
        }
    }

    // Search in an array
    public void searchInAnArray(int valueToSearch) {
        for (int j = 0; j < arr.length; j++) {
            if ( arr[j] == valueToSearch) {
                System.out.println("Value is found at index " + j);
                return;
            }
        }
        System.out.println("Value " + valueToSearch + " does not exist in array");
    }

    public void deleteFromAnArray(int i) {
      try{
          arr[i] = Integer.MIN_VALUE;
          System.out.println("Deleted Successfully");
      }catch(IndexOutOfBoundsException e) {
          System.out.println("Index is not with the array range");
      }
    }
}
