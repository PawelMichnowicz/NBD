 def zad01(str: String): String = {
   
    str match {
      case a if (List("poniedziałek", "wtorek", "środa", "czwartek", "piątek") contains(a)) => "Praca"
      case b if (List("sobota", "niedziela") contains(b)) => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }

  println(zad01("czerwiec"))
  println(zad01("poniedziałek"))
  println(zad01("sobota"))
