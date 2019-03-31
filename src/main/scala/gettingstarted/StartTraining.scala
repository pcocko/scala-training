package gettingstarted

object StartTraining {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  // Write a recursive function to get the nth Fibonacci number
  def fib(n: Int): Int = ???

  def main(args: Array[String]): Unit = println(formatAbs(-42))

}

object PolymorphicFunction {

  def findFirst[A](as: Array[A], p: A => Boolean):Int = {

    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else
        if (p(as(n))) n
        else loop(n + 1)

    loop(0)
  }

  // checks whether an Array[A] is sorted according to a given comparison function:
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = ???

  def main(args: Array[String]): Unit = {
      val first = findFirst(Array(1,3,5,6), (x:Int) => x > 3)
      println(first)
  }
}

object Currying {

  def wrapWithoutCurry(prefix:String, html:String, suffix:String):String = {
    prefix + html + suffix
  }

  // implement wrapWithCurry
  def wrapWithCurry:String = ???

  def main(args: Array[String]): Unit = {
    val wrapWithDiv = wrapWithoutCurry("<div>",_: String,"</div>")
    wrapWithDiv("<p>Hello, world</p>")
  }

}


