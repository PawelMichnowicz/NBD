def twoNumbers: Iterator[(Int, Int)] = for {
  a <- Iterator.from(1)
  b <- 1 until a + 1 if a % b == 0
} yield (a, b)

val num = twoNumbers.buffered
  println(num.next)
  twoNumbers take 19 foreach println
  