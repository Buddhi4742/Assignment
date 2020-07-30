class Rational(x:Int,y:Int){
    def numer=x
    def denom=y
    def sub(number:Rational) = new Rational(this.numer*number.denom - number.numer*this.denom, this.denom*number.denom)
    def neg=new Rational(-this.numer,this.denom)
    override def toString = numer + "/" +denom
};


object Q2{
  def main(args:Array[String])={
    val x=new Rational(3,4)
    val y=new Rational(5,8)
    val z=new Rational(2,7)
    println((x.sub(y)).sub(z));
    //val temp = new Rational (x.sub(y).numer,x.sub(y).denom)
    //println(temp.sub(z));
  }

}


