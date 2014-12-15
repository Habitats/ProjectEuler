package Problem_009;

/**
 * Created by anon on 15.12.2014.
 */
public class PythagoreanTripler {

  public static void main(String[] args) {

    for (int a = 0; a < 1000; a++) {
      for (int b = a; b < 1000; b++) {
        double sqrt = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (sqrt == (int) sqrt && a + b + sqrt == 1000) {
          System.out.println(a + " " + b + " " + sqrt);
          System.out.println(a * b * (int)sqrt);
        }
      }
    }
  }
}
