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

    public static int binarySearch(int[] arr,int value) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int middle = left + (right-left)/2;
            if (arr[middle] == value) {
                System.out.println("The value is located at index "+ middle);
                return middle;
            } else if (arr[middle] > value) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        System.out.println("The value" + value + " is not found in the array");
        return -1;
    }
}
