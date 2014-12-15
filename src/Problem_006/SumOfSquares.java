package Problem_006;

import static java.lang.Math.pow;

public class SumOfSquares {

  int ans;
  int ans2;

  public static void main(String[] args) {

    SumOfSquares sos = new SumOfSquares();

    sos.findSos();

  }

  public void findSos() {
    for (int i = 1; i <= 100; i++) {
      ans += i * i;
      ans2 += i;
    }
    System.out.println(pow(ans2, 2) - ans);

  }

}
