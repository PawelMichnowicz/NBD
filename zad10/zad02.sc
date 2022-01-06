def double(x: Double): Double = (x*2)
def doubleyes(x: Double): Maybe[Double] = Yes(x*2)


trait Maybe[+A] {

}

case class No() extends Maybe[Nothing] {
  def applyFunction[R](function: Nothing => R): Maybe[R] = No()
  def getOrElse(param : Any) = param 

  def map[R](function: Nothing => R): Maybe[R] = No()
  def flatMap[R](function: Nothing => Maybe[R]): Maybe[R] = No()
}

case class Yes[A](val value: A) extends Maybe[A]
{
  def applyFunction[R](function: A => R): Maybe[R] = Yes(function(value))
  def getOrElse(param : Any) = value
  
  def map[R](function: A => R): Maybe[R] = Yes(function(value))
  def flatMap[R](function: A => Maybe[R]): Maybe[R] = function(value)
}

val no = No()
val yes = Yes(150.5)
println(no.map(double))
println(yes.map(double))
println(yes.flatMap(doubleyes))