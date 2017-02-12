//map
(1 to 9).map(0.1 * _)

//for each
(1 to 9).map("*" * _).foreach(println)

//filter
(1 to 9).filter(_%2 ==0).foreach(println)


(1 to 9).reduce(_ * _)

//reduce left

(1 to 9).reduceLeft(_ * _)

//fold left has an accumulator

(1 to 9).foldLeft(10)(_ + _)



//min / max functions
(1 to 9).reduceLeft(_ min _)

//The reduceRight and foldRight methods work
// the same as reduceLeft and foldLeft, respectively, but they begin at the end of the collection and work from right to left

(1 to 9).reduceRight(_ * _)

//difference created by reduce right

val divide = (x: Double, y: Double) => {
  val result = x / y
  println(s"divided $x by $y to yield $result")
  result
}

val a = Array(1.0, 2.0, 3.0)

a.reduceLeft(divide)

a.reduceRight(divide)

a.reduce(divide)

