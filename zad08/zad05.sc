

case class Osoba( private val _imie: String, private val _nazwisko: String, private val _podatek: Double = 0) {
  def podatek = _podatek
  def imie = _imie
  def nazwisko = _nazwisko
}


trait Student extends  Osoba{
  override def podatek = {
    0.0
  }
}

trait Nauczyciel extends Pracownik {
  override def podatek = {
    0.1*pensja
  }
}


trait Pracownik extends Osoba {
  var pensja = 0
  override def podatek = {
    0.2*pensja
  }
}


val pracownik = new Osoba("Pan", "Pracownik") with Pracownik 
pracownik.pensja = 3000

val student = new Osoba("Pan", "Student") with Student

val nauczyciel = new Osoba("Pan", "Nauczyciel") with Nauczyciel
nauczyciel.pensja = 4200

val studentPracownik = new Osoba("Student", "Pracownik") with Student with Pracownik
studentPracownik.pensja = 1000

val pracownikStudent = new Osoba("Pracownik", "Student") with Pracownik with Student
pracownikStudent.pensja = 1000


println("pracownik.pensja - " + pracownik.pensja)
println("pracownik.podatek - " + pracownik.podatek)
println("student.podatek - " + student.podatek)
println("nauczyciel.pensja - " + nauczyciel.pensja)
println("nauczyciel.podatek - " + nauczyciel.podatek)
println('\n')
println("studentPracownik.pensja -  " + studentPracownik.pensja)
println("studentPracownik.podatek -  " + studentPracownik.podatek)
println('\n')
println("pracownikStudent.pensja - " + pracownikStudent.pensja)
println("pracownikStudent.podatek -  " + pracownikStudent.podatek)