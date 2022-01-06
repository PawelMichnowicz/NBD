class KontoBankowe(private var stanKonta: Double){
  
  def this() = {
    this(0)}
  
  def getstanKonta() = stanKonta
  
  def wplata(ammount: Double) : Unit = {
  this.stanKonta += ammount
  }
  
  def wyplata(ammount: Double) : Unit = {
  this.stanKonta -= ammount
  }


  
}

val konto1 = new KontoBankowe(20)

println("Poczatkowy stan konta")
println(konto1.getstanKonta())

println("\nWplata 10zl")
konto1.wplata(10)
println(konto1.getstanKonta())

println("\nWyplata 6zl")
konto1.wyplata(6)
println(konto1.getstanKonta())



