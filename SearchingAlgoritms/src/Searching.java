public class Searching {

    public static int linearSearch(int[] arr,int value) {
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == value) {
                System.out.println("The value is located at index " + i);
                return i;
            }
        }
        System.out.println("The value " + value + " is not found in the array");
        return -1;
    }
}
