```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Int = {
    x + 1 
  }
}

object Main extends App{
  val obj = new MyClass()
  println(obj.myMethod()) //Prints 1

  val obj2 = new MyClass(5)
  println(obj2.myMethod()) // Prints 6
}
```