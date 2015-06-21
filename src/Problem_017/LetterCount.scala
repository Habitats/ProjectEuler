package Problem_017

object LetterCount extends App {
  val nums = Map(
    1 -> "one",
    2 -> "two",
    3 -> "three",
    4 -> "four",
    5 -> "five",
    6 -> "six",
    7 -> "seven",
    8 -> "eight",
    9 -> "nine",
    10 -> "ten",
    11 -> "eleven",
    12 -> "twelve",
    13 -> "thirteen",
    14 -> "fourteen",
    15 -> "fifteen",
    16 -> "sixteen",
    17 -> "seventeen",
    18 -> "eighteen",
    19 -> "nineteen",
    20 -> "twenty",
    30 -> "thirty",
    40 -> "forty",
    50 -> "fifty",
    60 -> "sixty",
    70 -> "seventy",
    80 -> "eighty",
    90 -> "ninety",
    100 -> "hundred"
  )

  def transform(n: Int): String = {
    if (n <= 20) return nums(n)
    else if (n < 100) {
      val s = ((n + "")(0) + "0").toInt
      if (n % 10 == 0) return nums(s.toInt)
      val s2 = (n + "")(1).getNumericValue
      return nums(s.toInt) + " " + nums(s2.toInt)
    }
    else if (n < 1000) {
      if (n % 100 == 0)
        nums(n.toString()(0).getNumericValue) + " hundred"
      else
        return nums(n.toString()(0).getNumericValue) + " hundred and " + transform(n.toString.substring(1).toInt)
    }
    else return "one thousand"
  }

  for(i <- 1 to 1000) println(transform(i))
  val a = for (i <- 1 to 1000) yield transform(i).replaceAll("\\s+","").length
  println(a)
  println(a(114))
  println(a.sum)

}


