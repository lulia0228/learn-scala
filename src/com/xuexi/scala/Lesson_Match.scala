package com.xuexi.scala

/**
 * (1)case _ 都匹配不上 放在最后
 * (2)可以匹配值，也可以匹配类型
 * (3)自上向下匹配 匹配上退出
 * (4)
 */

object Lesson_Match {
  def main(args: Array[String]): Unit = {
    val tp = (1,2.1,0,"abc",'a',true)
    val iter: Iterator[Any] = tp.productIterator
    iter.foreach(MatchTest)
  }

  def MatchTest(o:Any): Unit ={
    o match {
      case 1=>println("Value is 1")
      case i:Int=>println(s"type is Int, value = $i")
      case d:Double=>println(s"type is Double, value = $d")
      case s:String=>println(s"type is String, value = $s")
      case 'a'=>println("Value is a")
      case _ =>println("No match！")
    }
  }

}
