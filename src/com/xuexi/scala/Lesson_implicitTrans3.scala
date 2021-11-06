package com.xuexi.scala

/**
 * 3 隐式类
 * （1）隐式类必须定义到object class体中
 * （2）隐式类的构造必须只有一个参数
 */

class Rabbit1(xname:String){
  val name=xname
}

object Lesson_implicitTrans3 {

  implicit class Animal1(r:Rabbit1){
    def showName()={
      println(s"${r.name} is Rabbit...")
    }
  }

  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit1("RABBIT")
    rabbit.showName()
  }
}
