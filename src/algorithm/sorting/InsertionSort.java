package algorithm.sorting;

import static common.Utils.LOG;

import common.Utils;
import java.util.Arrays;

/** Created by xzinoviou 11/4/2019 */
public class InsertionSort {

  public static void main(String[] args) {

    int[] numbers = Utils.unortedIntegersFew;

    LOG.info("Before sorting : " + Arrays.toString(numbers) + "\n");
    insertionSort(numbers);
    LOG.info("After sorting : " + Arrays.toString(numbers));
  }

  public static void insertionSort(int[] numbers) {

    int i = 0;

    while (i < numbers.length-1) {

      for (int j = i + 1; j > 0; j--) {
        if (numbers[j] <= numbers[j - 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j - 1];
          numbers[j - 1] = temp;
        }
      }
      i++;
    }
  }
}
