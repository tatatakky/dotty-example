package example

import example.EnumTypes._

import org.junit.Test
import org.junit.Assert._

class EnumTypesSpec {
  @Test def enumTypes: Unit = {
    assertEquals(GMT(9), Country.Japan.gmt)
  }
}