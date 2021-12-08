class Container[A](x: A){
  def getContent() : A = x
  
  
  
  def applyFunction[R](function: A => R) : R = {
    function(getContent())
  }
}



val container2 = new Container("text");
println(container2.getContent())
println(container2.applyFunction((a: String) => a+" dodatkowy text"))

val container3 = new Container(13);
println(container3.getContent())
println(container3.applyFunction((a: Int) => a * 10))