package com.xuexi.scala

trait IsEqual{
  def isEqual(o:Any):Boolean
  def isNotEqual(o:Any):Boolean = !isEqual(o)
}

class Point(xx:Int, xy:Int) extends IsEqual {
  val x = xx
  val y = xy

  override def isEqual(o: Any): Boolean = {
    o.isInstanceOf[Point] && o.asInstanceOf[Point].x == this.x
  }
}

object Lesson_Trait2 {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(xx = 1, xy = 2)
    val p2 = new Point(xx = 1, xy = 3)
    println(p1.isEqual(p2))
    println(p1.isNotEqual(p2))
  }
}
