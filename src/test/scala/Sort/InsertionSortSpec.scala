package Sort

import org.scalatest.FlatSpec

class InsertionSortSpec extends FlatSpec {

  "An Insertion Sort" should "return a sorted version of an array passed to it" in {
    assert(InsertionSort.insertionSort(Array(3, 2, 7, 1, 9, 0)) === Array(0, 1, 2, 3, 7, 9))
  }

}
