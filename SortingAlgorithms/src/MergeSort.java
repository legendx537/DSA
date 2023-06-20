public class MergeSort {

    static void merge(int[] A,int left, int middle,int right) {
        int[] leftTemp = new int[middle-left+2];
        int[] rightTemp = new int[right-middle+1];
        for (int i=0; i<=middle-left; i++) {
            leftTemp[i] = A[left+i];
        }
        for (int i=0; i<right-middle; i++) {
            rightTemp[i] = A[middle+1+i];
        }

        leftTemp[middle-left+1] = Integer.MAX_VALUE;
        rightTemp[right-middle] = Integer.MAX_VALUE;

        int i = 0 , j = 0;
        for (int k = left; k < right; k++) {
            if (leftTemp[i] < rightTemp[j]) {
                A[k] = leftTemp[i++];
            } else {
                A[k] = rightTemp[j++];
            }
        }
    }

    public static void mergeSort(int[] A,int left,int right) {
        if (right > left) {
            int m = (left+right) / 2;
            mergeSort(A,left,m);
            mergeSort(A,m+1,right);
            merge(A,left,m,right);
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
