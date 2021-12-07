val lista = List(
  "poniedziałek",
  "wtorek",
  "sroda",
  "czwartek",
  "piatek",
  "sobota",
  "niedziela"
)

println("\na)")
println(zad02a(lista))

println("\nb)")
println(zad02b(lista))



  def zad02a(myList: List[String]): String = {
    if (myList.tail.length>0)
      myList.head + ", " + zad02a(myList.tail)
    else 
      myList.head
  }
  

  def zad02b(myList: List[String]): String = {
    if (myList.tail.length>0)
      zad02b(myList.tail) + ", " + myList.head
    else 
      myList.head
  }
