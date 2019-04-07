package algorithm.sorting;

import static common.Utils.LOG;

import common.Utils;
import java.util.Arrays;

/** Created by xzinoviou 7/4/2019 */
public class MergeSort {

  public static void main(String[] args) {

    int[] numbers = Utils.unortedIntegersFew;

    LOG.info("Before sorting : " + Arrays.toString(numbers));
    sort(numbers, 0, numbers.length - 1);
    LOG.info("After sorting : " + Arrays.toString(numbers));
  }

  public static void sort(int[] numbers, int left, int right) {

    if (left < right) {
      int middle = (left + right) / 2;

      sort(numbers, left, middle);
      sort(numbers, middle + 1, right);
      merge(numbers, left, middle, right);
    }
  }

  public static void merge(int[] numbers, int left, int middle, int right) {

    /** Set length for temp arrays. */
    int n1 = middle - left + 1;
    int n2 = right - middle;

    /** Create the temp arrays. */
    int[] L = new int[n1];
    int[] R = new int[n2];

    /** fill the arrays with the correct values. */
    int i = 0;
    int j = 0;

    for (i = 0; i < n1; i++) L[i] = numbers[left + i];

    for (j = 0; j < n2; j++) R[j] = numbers[middle + 1 + j];

    /** reset the counters and set a global counter. */
    i = 0;
    j = 0;
    int k = left;

    /** merge and sort the two arrays. */
    while (i < n1 && j < n2) {

      if (L[i] < R[j]) {
        numbers[k++] = L[i++];

      } else {
        numbers[k++] = R[j++];
      }
    }

    /** what have remained , are the other sub arrays. just copy them. */
    while (i < n1) {
      numbers[k++] = L[i++];
    }

    while (j < n2) {
      numbers[k++] = R[j++];
    }
  }
}
