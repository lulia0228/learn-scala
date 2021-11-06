package com.xuexi.scala

object Lesson_Tuple {
  def main(args: Array[String]): Unit = {
    //元祖可以new,可以不new,可以直接用括号写（上限22）
    val tp1: Tuple1[String] = new Tuple1("hello")
    val tp2: (String, Int) = new Tuple2("a", 3)
    val tp3: (Int, Boolean, Char) = Tuple3(1, true, 'C')
    val tp4: (Int, Int, Int, Int, Int, Boolean) = (1,2,3,4,5,true)
    val value: Char = tp3._3
    println(value)
    println(tp4._6)
    println(tp2.swap) //只有Tuple2哟swap方法

    val iterator: Iterator[Any] = tp4.productIterator
    iterator.foreach(println)

    val str1: String = tp4.toString()
    println(str1)

  }

}
