package Problem_005;

public class EvenlyDivisible {

  public static void main(String[] args) {
    EvenlyDivisible ed = new EvenlyDivisible();

    int i = 1;
    while (!(ed.findSmallestED(i))) {
      i++;
    }
    System.out.println(i);
  }

  public boolean findSmallestED(int n) {
    for (int mod = 1; mod <= 20; mod++) {
      if (n % mod != 0) {
        return false;
      }
    }
    return true;
  }
}
