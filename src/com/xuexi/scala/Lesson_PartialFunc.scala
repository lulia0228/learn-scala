package com.xuexi.scala

/**
 * (1)偏函数只匹配一个值
 * (2)PartialFunction[A, B] A/B是匹配输入/输出类型
 */
object Lesson_PartialFunc {
  def my_test:PartialFunction[String, Int]={
    case "abc" =>2
    case "a"   =>1
    case _     =>200
  }

  def main(args: Array[String]): Unit = {
    val i: Int = my_test("abc")
    println(i)
  }

}
