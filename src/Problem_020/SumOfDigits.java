package Problem_020;

import java.math.BigInteger;

public class SumOfDigits {

  static BigInteger ans = BigInteger.valueOf(1L);
  ;
  static int sum = 0;

  public static void main(String[] args) {
    SumOfDigits sod = new SumOfDigits();

    long start = System.currentTimeMillis();

    sod.findSumOfDigits();
    long end = System.currentTimeMillis();
    System.out.println("shit took: " + (end - start) + " ms");
  }

  public void findSumOfDigits() {

    for (int i = 1000; i >= 1; i--) {
      ans = ans.multiply(BigInteger.valueOf(i));
//			System.out.println(ans);
    }

    for (Character n : ans.toString().toCharArray()) {
      sum += Character.getNumericValue(n);
    }
    System.out.println(ans.toString().length());
    System.out.println(sum);
  }

}
