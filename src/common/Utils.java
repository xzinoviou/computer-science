package common;

import java.util.logging.Logger;

/** Created by xzinoviou 6/4/2019 */
public class Utils {

  public static Logger LOG = Logger.getLogger(Object.class.getName());

  public static int[] sortedIntegers = {
    1, 2, 5, 8, 11, 15, 19, 20, 23, 27, 29, 38, 39, 43, 46, 49, 50, 51, 53, 55, 59, 60, 65, 66, 69,
    70, 75, 80, 82, 83, 85, 90, 95, 100
  };

  public static int[] unortedIntegersMany = {
    15, 55, 49, 2, 75, 8, 20, 23, 29, 39, 43, 82, 46, 50, 51, 53, 60, 69, 5, 70, 1, 66, 59, 80, 83,
    65, 85, 90, 27, 95, 38, 11, 100, 19
  };

  public static int[] unortedIntegersFew = {15, 55, 2, 75, 8, 20, 23, 100, 19, 65};
}
