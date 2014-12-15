package Problem_012;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TriangularNumbers {

  public static void main(String[] args) {

    long tri = 0;
    int i = 1;
    Map<Integer, Set<Integer>> tris = new HashMap<>();
    while (true) {
      tri += i;
      int divisors = getDivisors(tri);
      if (divisors > 500) {
        System.out.println(tri);
        break;
      }
      System.out.println(tri + " " + divisors);
      i++;
    }
  }

  private static int getDivisors(long tri) {
    int count = 0;
    for (int i = 1; i <= tri; i++) {
      if (tri % i == 0) {
        count++;
      }
    }
    return count;
  }
}


