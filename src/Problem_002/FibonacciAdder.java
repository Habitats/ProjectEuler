package Problem_002;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciAdder {

  private long ans;
  private int max;
  private long evenAns;
  //	private ArrayList<Long> numArr = new ArrayList<Long>();
  private ArrayList<BigInteger> numArr = new ArrayList<BigInteger>();
  private ArrayList<Long> evenArr = new ArrayList<Long>();
//	private LinkedList<Long> evenArr = new LinkedList<Long>();

  public static void main(String[] args) {
    FibonacciAdder fib = new FibonacciAdder();

    fib.getFibSeq();
  }

  public void getFibSeq() {

    numArr.add(BigInteger.valueOf(0));
    numArr.add(BigInteger.valueOf(1));
    double start = System.nanoTime();
    BigInteger ans = BigInteger.valueOf(0);

    while (numArr.size() <= 2534) {
      ans = numArr.get(numArr.size() - 2).add(numArr.get(numArr.size() - 1));
      numArr.add(ans);
      // System.out.println(ans);
      // if (ans %2 == 0)
      // evenArr.add(ans);
    }
//		System.out.println(ans);
    System.out.println("Computation time: " + (System.nanoTime() - start) + " ns");

    // for (long l : evenArr) {
    // evenAns += l;
    // System.out.println(l);
    // }
    // System.out.println(evenAns);
  }
}
