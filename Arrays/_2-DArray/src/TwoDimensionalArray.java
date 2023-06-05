public class TwoDimensionalArray {

    int[][] arr = null;

    // Instantiate and Initialization Part
    public TwoDimensionalArray(int rowSize,int columnSize) {
        arr = new int[rowSize][columnSize];
        for(int i=0; i < rowSize; i++) {
            for(int j=0; j< columnSize; j++) {
                arr[i][j] =  Integer.MIN_VALUE;
            }
        }
    }


    public void insertInTwoDimensionalArray(int row, int column, int value) {
       try{
           if( arr[row][column] == Integer.MIN_VALUE) {
               arr[row][column] = value;
               System.out.println("Value Inserted Successfully");
           } else System.out.println("Already Occupied!");
       } catch(IndexOutOfBoundsException e) {
           System.out.println("Invalid index for 2-d array");
       }
    }

    public void accessValues(int row, int column ) {
        System.out.println("Accessing Row -> " + row + " Col -> " + column);
        try{
            System.out.println("Cell value is  " + arr[row][column] );
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2-d array");
        }
    }

    public void traversal() {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public void searchValueInArray(int value) {
      for(int i=0; i< arr.length; i++ ) {
          for(int j=0; j< arr[0].length; j++ ) {
              if( arr[i][j] == value) {
                  System.out.println("Value found at row " + i + " Col " + j);
                  return;
              }
          }
      }
        System.out.println("Value does not exist in the 2-d array");
    }


    public void deleteFromArray(int row, int col) {
        try{
            System.out.println("Deleted successfully " + arr[row][col] );
            arr[row][col] = Integer.MIN_VALUE;
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
    }

}
