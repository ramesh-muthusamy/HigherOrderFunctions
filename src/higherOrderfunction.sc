def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)

def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def fact(x: Int): Int = if (x == 0) 1 else x*fact(x - 1)


def sumInts(a: Int, b: Int) = sum(id, a, b)
def sumCubes(a: Int, b: Int) = sum(cube, a, b)
def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

//A => B is the type of a function that takes an argument of
//type A and returns a result of type B

sumInts(1,4)
sumCubes(1,4)

fact(3)
fact(2)
fact(1)
sumFactorials(1,3)
