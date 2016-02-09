class SortRecursive {

  def getSortRecursive(aList : List[Int]) : List[Int] = aList.length match {
    case 0 => List()
    case _ =>
      var head = aList.head
      var tail = aList.tail

      getSortRecursive(tail.filter { x => x < head }) ++ aList.take(1) ++ getSortRecursive(tail.filter { x => x >= head})
  }

}
