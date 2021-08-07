package Sort

import org.scalatest.FlatSpec

class MergeSortSpec extends FlatSpec {

  "A Merge Sort" should "return a sorted version of an array passed to it" in {
    assert(MergeSort.mergeSort(Array(3,2,7,1,9,0)) === Array(0,1,2,3,7,9))
  }

}
