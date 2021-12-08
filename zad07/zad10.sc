def isIn (myList: List[Double]): List[Double] = {
  myList.filter(x =>  -5 <= x && x <= 12);
}

var numbers = List(13, -8, -9, 10.5, 12, 0, -3, -100);
println(isIn(numbers))
