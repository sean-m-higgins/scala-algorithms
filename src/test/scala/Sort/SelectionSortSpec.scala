package Sort

import org.scalatest.FlatSpec

class SelectionSortSpec extends FlatSpec {

  "A Selection Sort" should "return a sorted version of an array passed to it" in {
    assert(SelectionSort.selectionSort(Array(3,2,7,1,9,0)) === Array(0,1,2,3,7,9))
  }

}
