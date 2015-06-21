package Problem_015

object Lattice extends App {
  var count: Long = 0
  run(20, 20)

  def run(x: Int, y: Int) {
    count = 0
    move(x, y)
    print(count)
  }

  def move(x: Int, y: Int) {
    if (x == 0 && y == 0){
      count += 1
      if(count % 1000000 == 0) println(count)
    }
    if (x > 0)
      move(x - 1, y)
    if (y > 0)
      move(x, y - 1)

  }
}


