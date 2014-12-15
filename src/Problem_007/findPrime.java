package Problem_007;

import java.util.ArrayList;

public class FindPrime {


  private ArrayList<Integer> primeLst = new ArrayList<Integer>();
  static long start = System.currentTimeMillis();

  public static void main(String[] args) {
    FindPrime bpm = new FindPrime();

    bpm.findPrime1();

    // bpm.findPrime2();
    long end = System.currentTimeMillis();
    System.out.println("Execution time was " + (end - start) + " ms.");

  }

  // my variant
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

  // not mine! also slow as fuck
  public void findPrime2() {
    int number = 1, prime = 1, divide;

    while (number < 10001) {
      prime = prime + 2;
      divide = 1;
      while (true) {
        divide = divide + 2;
        if (prime == divide) {
          number++;
          break;
        } else if (prime % divide == 0 && prime != divide) {
          break;
        }
      }
    }
    System.out.println("The " + number + " prime is: " + prime);
  }

}
