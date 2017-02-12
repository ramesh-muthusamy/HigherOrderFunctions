/**
  * Created by Ramesh Muthusamy on 09-02-2017.
  */
class higherorderfunction {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)


}
