public class SelectionSort {

    static void selectionSort(int[] a) {
        for (int j=0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i=j+1; i < a.length; i++) {
                if (a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
