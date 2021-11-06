package com.xuexi.scala


/**
 * (1)Trait不能传参
 * (2)类继承多个trait时候第一个关键字是extends 后面都是with
 * (3)trait中方法体可不实现，类继承后要实现方法
 */
trait Read {
  def read(name:String): Unit ={
    println(s"$name is reading ...")
  }
}

trait Listen {
  def listen(name:String): Unit ={
    println(s"$name is listening ...")
  }
}

class Human() extends Read with Listen {

}

object Lesson_Trait1 {
  def main(args: Array[String]): Unit = {
    val h = new Human()
    h.read("zhangsan")
    h.listen("lisi")
  }

}
