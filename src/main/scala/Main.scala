import scala.annotation.tailrec

object Main extends App {

  @tailrec def factorial (x: Long, acc:Long = 1): Long = {

    if (x < 0) {
      -1
    }

    else if (x <= 1) {
      acc
    }

    else
      factorial(x-1, acc*x)
  }

  var number: Int = scala.io.StdIn.readInt()
  println (factorial(number.toLong))
}