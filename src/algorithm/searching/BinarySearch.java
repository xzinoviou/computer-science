package algorithm.searching;

import static common.Utils.LOG;

import common.Utils;
import java.util.Scanner;

/** Created by xzinoviou 6/4/2019 */
public class BinarySearch {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    LOG.info("Enter search term to look for: ");
    int x = sc.nextInt();

    int result = binarySearch(Utils.sortedIntegers, x);

    if (result < 0) {
      LOG.info("Number was not found");
    } else {
      LOG.info(
          String.format(
              "Number was found on position A[%d] = %d ", result, Utils.sortedIntegers[result]));
    }
  }

  public static int binarySearch(int[] A, int x) {

    int l, m, r;

    l = 0;
    r = A.length - 1;

    while (l <= r) {

      m = (l + r) / 2;

      if (x == A[m]) {
        return m;
      }

      if (x >= A[m]) {
        l = m + 1;
      }

      if (x < A[m]) {
        r = m - 1;
      }
    }

    return -1;
  }
}
