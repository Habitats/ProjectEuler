package util;

/**
 * Created by anon on 15.12.2014.
 */
public class Utilities {

  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    if (n == 1 || n % 2 == 0) {
      return false;
    }

    for (int i = 3; i < n; i += 2) {
      if (n != i && n % i == 0) {
        return false;
      }
    }
    return true;
  }

}
