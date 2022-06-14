@main def hello: Unit = 
  println("Hello world!")
  def msg = "I was compiled by Aki Scala 3. :)"
  println(msg)
  println(newNumbers)
  println(numsBig)
  println(" TEST : " + tot)
  println(" TWO : " + takeOut)
  println(List.range(1, 4))
  println(List.range(start = 5, end = 10, step = 2))
  println(oldNumbers.distinct)
  println(oldNumbers.head)
  println(List("apple", "pear").flatMap(_.toUpperCase()))
  println(nums.sorted )                              // List(1, 5, 7, 8, 10)
  println(nums.sortWith(_ < _)   )                   // List(1, 5, 7, 8, 10)
  println(nums.sortWith(_ > _))
  case class Person(name: String)
  val p = Person("Mitchael Scott")
  println(p.name)
  println(oldNumbers.filter(_ < 4).map(_ * 2))
  val g = List.range(start = 4, end = 15, step = 4);
  println(g)
  println(g.reduceLeft(_ + _))
  def add(a: Int, b: Int) = a + b
  println(add(5, 3))
  println(oldNumbers.size)
  oldNumbers.foreach((i: Int) => print(i + ", "))
  val double = (i: Int) => i * 2
  println(oldNumbers.map(double))
  println(isEvenMethod(4))
  println(isEvenFunction(4))
  sayHello(helloJoe)
  englishGreeting("Mark")
  println("result 1 :  " + result1)
  println("result 2 :  " + result2)
  println(someValue)
  println(emptyValue)
  println(b)
  println("STOP : ")
  println(value2 getOrElse {"default function"})
  println(value2 getOrElse "No value")
  println(value1 getOrElse "No value")


  def isEvenMethod(i: Int) = i % 2 == 0         // a method
val isEvenFunction = (i: Int) => i % 2 == 0   // a function
  val someValue: Option[String] = Some("I am wrapped in something")
  
val emptyValue: Option[String] = None

def sayHello(f: () => Unit): Unit = f()
def helloJoe(): Unit = println("Hello, Joe")
val englishGreeting = (name: String) => println(s"Hello you $name ")

val number: Option[Int] = Some(4)
val noNumber: Option[Int] = None
val result1 = number.fold(1)(_ * 3)
val result2 = noNumber.fold(1)(_ * 3)


val oldNumbers = List(8, 1, 2, 3, 4, 5, 6, 4, 5, 6);
val newNumbers = oldNumbers.map(_ * 2)
val numsBig = newNumbers.filter(_ > 5)
val tot = newNumbers.find(_ > 2)
val takeOut = newNumbers.takeWhile(_ < 3)
  val nums = List(10, 5, 8, 1, 7)

  val a = List("jane", "jon", "mary", "joe")
val b = a.filter(_.startsWith("j"))
         .map(_.capitalize)

def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
  if (flag) Some("Found value") else None
}

val value1 = maybeItWillReturnSomething(true)
val value2 = maybeItWillReturnSomething(false)