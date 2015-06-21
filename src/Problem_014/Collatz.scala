package Problem_014

import scala.collection.mutable

object Collatz extends App {
  def collatz(n: Long, length: Long): Long = {
    val newN = if (n % 2 == 0) n / 2 else n * 3 + 1
    if (newN == 1)
      return length
    collatz(newN, length + 1)
  }

  def search(n: Long) {
    val vals = new mutable.HashMap[Long, Long]
    for (i <- 1L to n) {
      vals += i -> collatz(i, 0)
    }

    val max = vals.maxBy(_._2)
    print(max)
  }

  search(1000000)
}


