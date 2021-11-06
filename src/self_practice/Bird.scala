package self_practice

// 定义一个 trait
trait Flyable {
  // 声明一个抽象字段
  var maxFlyHeight:Int
  // 定义一个抽象方法
  def fly(): Unit
  // 定义一个具体的方法
  def breathe(): Unit = {
    println("我能呼吸...")
  }
}

// 定义一个动物类
class Animal(val category: String) {
  def info() {
    println("这动物的属性为：" + category)
  }
}

// 定义 Bird 类并继承 trait Flyable
class Bird(flyHeight:Int) extends Animal("Bird") with Flyable {
  // 重写 trait 的抽象字段
  var maxFlyHeight: Int = flyHeight
  // 重写 trait 的抽象方法
  def fly() {
    println("我可以飞" + maxFlyHeight + "米高。")
  }
}

object Bird {
  def main(args: Array[String]): Unit = {
  val b = new Bird(50)
  b.fly()
  b.info()
  b.breathe()
  }
}