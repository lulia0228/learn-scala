package com.xuexi.scala

/**
 * 1 隐式值，隐式参数
 * （1）方法参数前用implicit声明，如果是部分参数采用柯里化，隐式转换的参数放在后面，且只能出现一次
 * （2) 一个作用域同样类型的隐式值只能有一个
 * （3）作用：调用函数时候可不传值，scala会自己在作用域寻找参数传入
 */
object Lesson_implicitTrans1 {

  def sayName(implicit name:String)={
      println(s"$name is student ...")
    }

  def sayName_(age:Int=18)(implicit name:String)={
    println(s"$name is student, age is $age ...")
  }

  def main(args: Array[String]): Unit = {
    implicit val name:String = "张三"
    sayName
    //柯里化
    sayName_(20)
  }
}
