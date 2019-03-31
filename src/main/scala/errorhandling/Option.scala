package errorhandling

trait Option[+A] {

  def map[B](f: A => B): Option[B] = ???

  def getOrElse[B >: A](default: => B): B = ???

  def filter(f: A => Boolean): Option[A] = ???

}

case class Some[+A](get: A) extends Option[A]
case object None extends Option[Nothing]

