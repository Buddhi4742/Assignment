
case class Point(a: Int, b: Int) {
  def x: Int = a
  def y: Int = b

  def +(p:Point)={
  Point(this.x+p.x ,this.y+p.y)
  }
  
  def move(dx:Int, dy:Int)={
  Point(this.x+dx,this.y+dy)
  }

  def distance(p_1:Point):Double={
  var Xval:Int =p_1.x-this.x
  var Yval:Int =p_1.y-this.y
  var D:Double =Xval*Xval + Yval*Yval
  var result:Double =math.sqrt(D)
  return result
  }

  def invert()={
    Point(this.y,this.x)
  } 

}

object caseclass{

def main(args:Array[String])={
  
  val p1=Point(1,2)
  val p2=Point(4,5)
  val p3=p1+p2
  println("Point 1: " +p1)
  println("Point 2: " +p2)
  println("Point 1 + Point 2: " +p3)
  val p4=p1.move(2,2)
  println("Point 1 moved by (2,2) : " +p4)
  println("Disntance between Point 1, Point 2: "+p1.distance(p2))
  val p5=p2.invert()
  println("Point 2 inverted :" +p5)
}


}
