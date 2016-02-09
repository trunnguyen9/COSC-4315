object Main {
  def byName(a: => Unit) = {
    for (i <- 0 until 10) {println(a)}

  }
  
  def main(args: Array[String]) {
    var i = 1;
 
    byName(i = i + 1)
    println(i)
 
  }
}