package com.xuexi.scala

//样例类默认实现了类构造参数的getter方法
//样例类可以new 也可以不new
case class Person1(name:String, age:Int)

object Lesson_CaseClass {
  def main(args: Array[String]): Unit = {
    val p1 = new Person1("lisi", 18)
    val p2 = new Person1("lisi1", 18)
    println(p1.equals(p2)) //样例类自动写了equals
    println(p1) //样例类自动写了toString
  }

}
