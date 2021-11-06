package com.xuexi.scala

//import scala.language.implicitConversions

/**
 * 2 隐式转换函数
 * （1）A类型调用了一个该类型不含有的方法f, 而B类型含有f方法
 * （2) 注意：隐式转换函数只和输入和输出的类型有关，
 *      因此作用域内只能存在唯一一个输入和输出组合类型的函数
 */

class Animal(name:String){
  def canFly(): Unit ={
    println(s"$name can fly...")
  }
}

class Rabbit(xname:String){
  val name: String = xname
}


object Lesson_implicitTrans2 {

  //隐式转换函数
  implicit def rabToAnima(r:Rabbit):Animal={
    new Animal(r.name)
  }

  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit("rabbit")
    rabbit.canFly()
  }
}
