package Problem_001;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();

    main.numLst();

  }

  public void numLst() {
    int ans = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 5 == 0 || i % 3 == 0) {
        ans += i;
      }

    }
    System.out.println(ans);
  }

}
