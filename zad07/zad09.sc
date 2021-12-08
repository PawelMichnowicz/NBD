def boost(myList: List[Int]): List[Int] = {
  myList.map(x => x + 1);
}

val lista = List(1,2,3,10,13)

println(boost(lista))