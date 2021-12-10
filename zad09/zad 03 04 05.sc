trait Maybe[+A] {

}

case class No() extends Maybe[Nothing] {
  def applyFunction[R](function: Nothing => R): Maybe[R] = No()
  def getOrElse(param : Any) = param 

}

case class Yes[A](val value: A) extends Maybe[A]
{
  def applyFunction[R](function: A => R): Maybe[R] = Yes(function(value))
  def getOrElse(param : Any) = value
}

println("zad02")
val no = new No
println(no.isInstanceOf[Maybe[_]])
val yes = new Yes[String]("yes string")
println(yes.isInstanceOf[Maybe[_]])

println("\nzad3")
println(no.applyFunction((value: String) => value))
println(yes.applyFunction((value: String) => value))

println("\nzad4")
println(no.getOrElse("param getOrElse-No"))
println(yes.getOrElse("param getOrElse-Yes"))
