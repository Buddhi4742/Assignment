class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
  def neg=new Rational(-this.numer,this.denom)
  override def toString = numer + "/" + denom
};

object Q1{

  def main(args:Array[String])={
    println("Enter numberator: ")
    var numerator=scala.io.StdIn.readInt()
    println("Enter denominator: ")
    var denominator=scala.io.StdIn.readInt()
    var obj =new Rational(numerator,denominator);
    println(obj.neg)
  }


}


