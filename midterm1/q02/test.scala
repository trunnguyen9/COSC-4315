object Main {
  def byValue(a: Unit) = {
    for (i <- 0 until 10) {println(a)}

  }
  
  def main(args: Array[String]) {
    var i = 1;
 
    byValue(i = i + 1)
    println(i);
 
  }
}