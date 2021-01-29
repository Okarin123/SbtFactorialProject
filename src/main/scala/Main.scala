object Main extends App {

  def factorial (x: Long): Long = {

    if (x < 0) {
      return -1
    }

    if (x <= 1) {
      return 1
    }

    return x*factorial(x-1)
  }

  var number: Int = scala.io.StdIn.readInt()
  println (factorial(number.toLong))
}