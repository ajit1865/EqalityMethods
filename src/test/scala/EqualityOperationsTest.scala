import org.scalatest.flatspec.AnyFlatSpec

class EqualityOperationsTest extends AnyFlatSpec {
  val testEqualityOperation = new EqualityOperations
  val firstList = List(1, 2, 3, 4, 5)
  val secondList = List(1, 23, 87, 98)
  it should "Compare values of both list are equal or not" in{
    assert(testEqualityOperation.doubleEqualCheck(firstList, secondList) == false)
  }

  it should "compare two list values are !=" in{
    assert(testEqualityOperation.notEqualCheck(firstList, secondList) == true)
  }

  it should "ne test for reference inequality between two objects" in{
    assert(testEqualityOperation.neCheckOperation(firstList, secondList) == true)
  }

  it should "eq is an operator used to test for reference equality between two objects"
    assert(testEqualityOperation.eqCheckOperation(firstList, secondList) == false)
}
