package self_practice

// 定义一个 trait
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

// 定义一个 Point 类并继承 trait Equal
class Point(xc:Int, yc:Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
}

// 定义一个单例对象
object TestTrait {
  def main(args:Array[String]) {
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}

