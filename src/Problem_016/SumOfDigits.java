package Problem_016;

import java.math.BigInteger;

public class SumOfDigits {

  public static void main(String[] args) {
    SumOfDigits sod = new SumOfDigits();

    sod.findSumOfDigits();
  }

  public void findSumOfDigits() {
    BigInteger ans = BigInteger.valueOf(1);
    int sum = 0;

    for (int i = 0; i < 1000; i++) {
      ans = ans.multiply(BigInteger.valueOf(2));
    }
    for (Character c : ans.toString().toCharArray()) {
      sum += Character.getNumericValue(c);

    }
    System.out.println(ans);
    System.out.println(sum);

  }
}
