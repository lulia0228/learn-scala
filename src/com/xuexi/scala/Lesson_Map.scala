package com.xuexi.scala

object Lesson_Map {
  def main(args: Array[String]): Unit = {
    val mp = Map[String,Int]("a"->1,"b"->2, ("c",3))
    println(mp)
    mp.foreach(println)
    for(elem<-mp){
      println(elem)
    }
    val val1: Option[Int] = mp.get("a")
    println(val1)
    val val2: Int = mp.getOrElse("aa", 10000)
    println(val2)

    val keys: Iterable[String] = mp.keys
    keys.foreach(println)
    val values: Iterable[Int] = mp.values
    values.foreach(println)

    val mp_1 = Map[String,Int](("a",1),("b",2), ("c",4))
    val mp_2 = Map[String,Int](("a",10),("b",20), ("d",4))
    //mp_2要替换掉mp_1
    val mp_cat: Map[String, Int] = mp_1.++(mp_2)
    mp_cat.foreach(println)

    //可变map
    import scala.collection.mutable
    val mp_v = mutable.Map[String,Int](("a",1), ("b",2), ("c",3))
    mp_v.put("a",11)
    mp_v.foreach(println)
    val value1: mutable.Map[String, Int] = mp_v.filter(tp => {
      val key_ = tp._1
      val value = tp._2
      value == 3
    })
    value1.foreach(println)

  }
}
