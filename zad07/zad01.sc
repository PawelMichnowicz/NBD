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
zad01a(lista)

println("\nb)")
zad01b(lista)

println("\nc)")
zad01c(lista)

def zad01a (lista : List[String]) = {
  var result = ""
  
  for (day <- lista) { 
    if (result == "") result = day
    else result = result + ", " + day
  }
  
  println(result)
}


def zad01b (lista : List[String]) = {
  var result = ""
  
  for (day <- lista) { 
    if (result == "" && day.startsWith("p")) result = day
    else if (day.startsWith("p")) result = result + ", " + day
  }
  
  println(result)
}


def zad01c (lista : List[String]) = {
  var result = ""
  var i = 0 
  
  while (i < lista.length) { 
    if (result == "") result = lista(i)
    else result = result + ", " + lista(i)
    i = i + 1
  }
  
  println(result)
}
                  