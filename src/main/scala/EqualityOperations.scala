
/* EqualityOperations contains all functionality to check both list are same */
class EqualityOperations {

  /* Demonstrated all equality operators with list */
  def doubleEqualCheck(firstList: List[Int], secondList: List[Int]): Boolean = {
    /* == is also used to compare lists for equality. */
    firstList == secondList
  }

  def notEqualCheck(firstList: List[Int], secondList: List[Int]): Boolean = {
    /* != is an operator used to test for inequality between two values */
    firstList != secondList
  }

  def neCheckOperation(firstList: List[Int], secondList: List[Int]): Boolean = {
    /* ne is an operator used to test for reference inequality between two objects */
    firstList ne secondList
  }

  def eqCheckOperation(firstList: List[Int], secondList: List[Int]): Boolean = {
    /* eq is an operator used to test for reference equality between two objects */
    firstList eq secondList
  }

}