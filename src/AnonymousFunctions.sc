// (x: Int) => x * x * x
// syntax (x1 : T1, ..., xn : Tn) ⇒ E

//syntactic sugar representation def f(x1 : T1, ..., xn : Tn) = E; f
def sum(f: Int => Int, a: Int, b: Int): Int =
if (a > b) 0
else f(a) + sum(f, a + 1, b)

def sumInts(a: Int, b: Int) = sum(x => x, a, b)
def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)

sumInts(1,4)
sumCubes(1,4)