import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
  int[] arr;

  public BucketSort(int[] arr) {
      this.arr = arr;
  }
  public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
  }


  // print buckets
  public void printBuckets(ArrayList<Integer>[] buckets) {
      for (int i = 0; i < buckets.length; i++) {
          System.out.println("Bucket#" + i + ":");
          for (int j = 0; j < buckets[i].size(); j++) {
              System.out.print(buckets[i].get(j) + " ");
          }
          System.out.println();
      }
  }

  public void bucketSort(int[] arr) {
      int numberOfBuckets = (int) Math.round(Math.sqrt(arr.length));
      int maxNumber = Integer.MIN_VALUE;
      for (int value:arr) {
          maxNumber = Math.max(value , maxNumber);
      }

      ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
      for (int i = 0; i < numberOfBuckets; i++) {
          buckets[i] = new ArrayList<Integer>();
      }

      for (int value:arr) {
          int findBucket = (int) Math.ceil(((float)value * numberOfBuckets)/maxNumber);
          buckets[findBucket-1].add(value);
      }

      System.out.println("\nBuckets Before Sorting");
      printBuckets(buckets);

      for (ArrayList<Integer> bucket:buckets) {
          Collections.sort(bucket);
      }

      System.out.println("\nBuckets After Sorting");
      printBuckets(buckets);

      int index = 0;
      for (ArrayList<Integer> bucket:buckets) {
          for (int value:bucket) {
              arr[index++] = value;
          }
      }
  }
}
