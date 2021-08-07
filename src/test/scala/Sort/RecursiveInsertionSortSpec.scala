package Sort

import org.scalatest.FlatSpec

class RecursiveInsertionSortSpec extends FlatSpec {

  "A Recursive Insertion Sort" should "return a sorted version of a list passed to it" in {
    assert(RecursiveInsertionSort.recursiveInsertionSort(List(3,2,7,1,9,0)) === List(0,1,2,3,7,9))
  }

}
