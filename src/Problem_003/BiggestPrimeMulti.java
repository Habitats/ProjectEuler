package Problem_003;

import java.util.ArrayList;

import static util.Utilities.isPrime;

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


}
