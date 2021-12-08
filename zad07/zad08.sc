import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
import scala.collection.mutable.ListBuffer


val intList = ListBuffer(5, 4, 0, 2, 0, 1, 3, 0, 5)


def delZero(index: Int, myList: ListBuffer[Int]): ListBuffer[Int] = {
  
  if (index >= myList.length) return myList;

  if (myList.get(index) == 0)
    myList.remove(index)
    delZero(index + 1, myList)
  else
    delZero(index + 1, myList)
}

println(delZero(0, intList))