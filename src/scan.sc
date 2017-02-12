val product = (x: Int, y: Int) => {
  val result = x * y
  println(s"multiplied $x by $y to yield $result")
  result
}

val a = Array(1, 2, 3)
10 * 1 = 10
10 * 2 =20
20* 3= 60

a.scanLeft(10)(product).foreach(println)
