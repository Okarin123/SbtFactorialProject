import org.scalatest.FunSuite

object MainTest  extends FunSuite {
  test ("Main.factorial") {
    assert (Main.factorial(1) === 1)
    assert (Main.factorial(0) === 1)
    assert (Main.factorial(3) === 6)
    assert (Main.factorial(9) === 362880)
  }
}