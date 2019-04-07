package algorithm.sorting;

import static common.Utils.LOG;

import common.Utils;
import java.util.Arrays;

/** Created by xzinoviou 7/4/2019 */
public class QuickSort {

  public static void main(String[] args) {

    int[] numbers = Utils.unortedIntegersFew;

    LOG.info("Before sorting : " + Arrays.toString(numbers) + "\n");
    sort(numbers, 0, numbers.length - 1);
    LOG.info("After sorting : " + Arrays.toString(numbers));
  }

  public static void sort(int[] numbers, int left, int right) {

    if (left < right) {
      int pivot = partition(numbers, left, right);
      sort(numbers, left, pivot - 1);
      sort(numbers, pivot + 1, right);
    }
  }

  public static int partition(int[] numbers, int left, int right) {

    int j = left;
    int i = left - 1;
    int pivot = right;

    while (j < pivot) {
      if (numbers[j] <= numbers[pivot]) {
        int temp = numbers[j];
        numbers[j] = numbers[++i];
        numbers[i] = temp;
      }
      j++;
    }

    /** when finished , swap pivot. */
    int temp = numbers[++i];
    numbers[i] = numbers[pivot];
    numbers[pivot] = temp;
    return i;
  }
}
