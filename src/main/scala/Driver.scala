
object Driver extends App{
  val firstList = List(1, 2, 3, 4, 5)
  val secondList = List(1, 2, 3, 4)

  private val equalityOperation = new EqualityOperations

  println(equalityOperation.doubleEqualCheck(firstList, secondList))
  println(equalityOperation.notEqualCheck(firstList, secondList))
  println(equalityOperation.neCheckOperation(firstList, secondList))
  println(equalityOperation.eqCheckOperation(firstList, secondList))
}
