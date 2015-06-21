package Problem_013

import scala.io.Source

object Sum extends App{
  val sum = Source.fromFile("src/Problem_013/input.txt").getLines.map(i => BigInt(i)).toArray.sum
  println(sum)
  println(sum.toString.substring(0,10))
}


