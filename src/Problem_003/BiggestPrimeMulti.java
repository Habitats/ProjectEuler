package Problem_003;

import java.util.ArrayList;

public class BiggestPrimeMulti {

  private long max = 600851475143L;
  private long maxMultiple;
  private ArrayList<Integer> primeLst = new ArrayList<Integer>();


  public static void main(String[] args) {
    BiggestPrimeMulti bpm = new BiggestPrimeMulti();

    bpm.findBiggestPrimeMulti();
  }

  public void findBiggestPrimeMulti() {

    long i = 0;
    while (i < max) {

    }

  }

  public void findPrime1() {

    int i = 0;
    int j = 0;
    while (j < 10001) {
      if (isPrime(i)) {
        primeLst.add(i);
        j++;
      }
      i++;
    }
    System.out.println(primeLst.get(primeLst.size() - 1));
  }

  public boolean isPrime(int n) {
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
