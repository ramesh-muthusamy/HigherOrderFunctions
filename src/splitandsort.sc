"hello world".split(" ")

"helloing worldy".split(" ").sortWith(_.length < _.length).foreach(
  println
)

val s = "eggs, milk, butter, Coco Puffs"

s.split(",").map(_.trim)