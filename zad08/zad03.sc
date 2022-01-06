

case class Osoba(imie: String, nazwisko: String) {}

val osoba1 = new Osoba("Tomasz",  "Hajto")
val osoba2 = new Osoba("Robert",  "Lewandowski")
val osoba3 = new Osoba("Pan",  "XYZ")
val osoba4 = new Osoba("Jan",  "Kowalski")


def sayHi(pers: Osoba): Unit = pers match {
  case Osoba("Tomasz",  "Hajto") => println("Witaj, proszę nie wsiadać do auta")
  case Osoba("Robert",  "Lewandowski") => println("Dzień dobry, pozdrowienia od Leo")
  case Osoba("Pan", _) => println("Witaj Panie!")
  case _ => println("Domyślnie Witam!")
}



sayHi(osoba1)
sayHi(osoba2)
sayHi(osoba3)
sayHi(osoba4)
