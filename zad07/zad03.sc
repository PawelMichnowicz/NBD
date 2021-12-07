import scala.annotation.tailrec

val lista = List(
  "poniedziałek", 
  "wtorek",
  "środa",
  "czwartek",
  "piątek",
  "sobota",
  "niedziela")

println(zad03(lista))
  
  
def zad03(myList: List[String]) : String = {
  @tailrec def tailer(myList: List[String], string: String) : String = {
    if(myList.length>0)
      tailer(myList.tail, string + ", " + myList.head)
    else 
      string
  }

  tailer(myList.tail, myList.head)
}
