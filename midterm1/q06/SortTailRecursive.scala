import scala.annotation.tailrec

class SortTailRecursive {

  @tailrec final def getSortTailRecursive(aList : List[Int]) : List[Int] = aList.length match {
    case 0 => List()
    case _ =>
      var head = aList.head
      var tail = aList.tail
      var newList = tail.filter { x => x < head } ++ aList.take(1) ++ tail.filter { x => x >= head}

      if(newList.equals(aList)) {
        aList
      }else {
        getSortTailRecursive(newList)
      }
  }

}
