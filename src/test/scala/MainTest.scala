import org.scalatest.FunSuite

object MainTest  extends FunSuite {
  test ("Main.factorial") {
    assert(Main.factorial(1) === 1)
  }
}
