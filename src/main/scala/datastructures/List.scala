package datastructures

sealed trait List[+A]

case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))


  //Implement the function tail for removing the first element of a List
  def tail[A](l: List[A]): List[A] = ???

  // Implement the function setHead to add an element int the first position of the List
  def setHead[A](l: List[A], h: A): List[A] = ???

  // Implement function append to add two lists
  def append[A](a1: List[A], a2: List[A]): List[A] = ???


  def foldRight[A,B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => f(x, foldRight(xs, z)(f))
  }

  // Calculate the List length using foldRight
  def length[A](as: List[A]): Int = ???

  // Implement function map that apply a funciton foreach element in the List
  def map[A,B](as: List[A])(f: A => B): List[B] = ???


}

object ListFunctions {
  def main(args: Array[String]): Unit = {

    val sum = List.foldRight(List(1,2,3,4,5,6),0)(_ + _)
    println(sum)
  }
}