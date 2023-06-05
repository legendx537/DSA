import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray =new TwoDimensionalArray(3 ,3);

        System.out.println("Inserting in and 2-d Array -> O(1) ");
        twoDimensionalArray.insertInTwoDimensionalArray( 0 , 0 , 10);
        twoDimensionalArray.insertInTwoDimensionalArray( 0 , 0 , 20);

        System.out.println(Arrays.deepToString( twoDimensionalArray.arr ) );

        System.out.println("Accessing in an 2-d Array -> O(1) ");
        twoDimensionalArray.accessValues(  0 , 0);

        System.out.println("Traversal of 2-d array is -> O( row * column ) ");
        twoDimensionalArray.traversal();

        System.out.println("Time Complexity for searching is -> O ( row * column ) ");
        twoDimensionalArray.searchValueInArray( 10 );
        twoDimensionalArray.searchValueInArray( 20 );

        System.out.println("Deleting from a 2-d Array is -> O(1) ");
        System.out.println(Arrays.deepToString( twoDimensionalArray.arr ) );
        twoDimensionalArray.deleteFromArray( 0, 0);
        System.out.println(Arrays.deepToString( twoDimensionalArray.arr ) );

    }
}