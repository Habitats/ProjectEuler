package Problem_004;

public class Palindrome {

  static int ans = 0;

  public static void main(String[] args) {
    Palindrome p = new Palindrome();

    p.findBiggestPalindrome();

    System.out.println(ans);
  }

  public void findBiggestPalindrome() {
    for (int i = 1; i < 1000; i++) {
      for (int j = 1; j < 1000; j++) {
        if (checkPair(i, j)) {
          if (ans < i * j) {
            ans = i * j;
          }
        }
      }
    }
  }

  public boolean checkPair(int a, int b) {
    int ans = a * b;
    return isPalindrome(ans);
  }

  public boolean isPalindrome(int n) {
    String nStr = Integer.toString(n);
    for (int i = 0; i < nStr.length() / 2; i++) {
      if (nStr.charAt(i) != nStr.charAt(nStr.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
