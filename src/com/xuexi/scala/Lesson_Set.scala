package com.xuexi.scala

import scala.collection.mutable

object Lesson_Set {
  def main(args: Array[String]): Unit = {
    val st = Set[Int](1,2,2,3,4)
    st.foreach(println)

    val st1 = Set[Int](2,3,4,5)
    val value: Set[Int] = st.intersect(st1)
    println(value)

    val value1: Set[Int] = st1 &~ st
    println(value1)

    val value2: Set[Int] = st1.diff(st)
    println(value2)

    val value3: Set[Int] = st.filter(a => {
      a > 2
    })
    println(value3)

    import scala.collection.immutable
    //可变set
    import scala.collection.mutable
    val n_st: mutable.Set[Int] = mutable.Set[Int](1,2,3,4)
    n_st.+=(5)
    n_st.foreach(println)






  }
}
