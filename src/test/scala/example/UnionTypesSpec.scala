package example

import example.UnionTypes.{Failure, Success, divide}
import org.junit.Test
import org.junit.Assert._

class UnionTypesSpec {
  @Test def divideSuccess: Unit = {
    assertEquals(Success(2.0), divide(6.0, 3.0))
  }
  @Test def divideFailure: Unit = {
    assertEquals(Failure("it can't divide zero"), divide(6.0, 0))
  }
}