val lista = List(
  "poniedziałek", 
  "wtorek",
  "środa",
  "czwartek",
  "piątek",
  "sobota",
  "niedziela")

println("a)")
println(zad04a(lista))

println("\nb)")
println(zad04b(lista))

println("\nc)")
println(zad04c(lista))

def zad04a(myList: List[String]) : String = {
    myList.tail.foldLeft(myList(0))(_ + ", " + _)
  }


def zad04b(myList: List[String]) : String = {
    myList.foldRight("")(_ + ", " + _)
  }


def zad04c(myList: List[String]) : String = {
    myList.filter(_.startsWith("p")).tail.foldLeft(myList(0))(_ + ", " + _)
  }
