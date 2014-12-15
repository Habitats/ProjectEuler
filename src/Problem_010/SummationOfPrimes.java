package Problem_010;

import java.math.BigInteger;

import util.Utilities;

/**
 * Created by anon on 15.12.2014.
 */
public class SummationOfPrimes {

  public static void main(String[] args) {

    BigInteger sum = BigInteger.valueOf(0);
    for (int i = 0; i < 2000000; i++) {
      if (Utilities.isPrime(i)) {
        sum = sum.add(BigInteger.valueOf(i));
      }

      if (i % 10000 == 0) {
        System.out.println((int) ((double) i / 2000000 * 100));
      }
    }

    System.out.println(sum);
  }
}
