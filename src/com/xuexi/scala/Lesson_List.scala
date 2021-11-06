package com.xuexi.scala

import scala.collection.mutable.ListBuffer

object Lesson_List {
  def main(args: Array[String]): Unit = {
    val ls = List[Int](1,3,4)
    ls.foreach(println)

    //map方法
    val str1_ls = List[String]("hey spark", "hey scala", "hey java")
    val value: List[Array[String]] = str1_ls.map(s => s.split(" "))
    value.foreach(arr=>{arr.foreach(println)})

    //flatmap方法
    val value1: List[String] = str1_ls.flatMap(s => s.split(" "))
    value1.foreach(println)

    //filter方法
    val value2: List[String] = str1_ls.filter(s => {
      "hey scala".equals(s)
    })
    println("=============")
    value2.foreach(println)

    //count方法
    val i: Int = str1_ls.count(s => {
      s.length == 9
    })
    println(i)

    //可变长度
    val b_ls = ListBuffer[Int](1,2,3)
    b_ls.append(100)
    b_ls.appendAll(List[Int](4,5,6))
    b_ls.foreach(println)

  }

}
