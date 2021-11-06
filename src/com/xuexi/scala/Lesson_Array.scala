package com.xuexi.scala

//import scala.collection.mutable.ArrayBuffer

object Lesson_Array {
  def main(args: Array[String]): Unit = {
    //1 用object方式创建数组
    //不new的话就是object
    val arr: Array[String] = Array[String]("a","b","c")
    val arr_ : Array[String] = Array[String]("d","e","f")
    //for (elem <- arr) {println(elem)}
    arr.foreach(println)

    //2 用 class方式创建数组
    val arr1 = new Array[Int](5)
    arr1.foreach(println)
    //scala赋值用小括号索引，不是中括号
    arr1(0) = 100; arr1(1) = 200; arr1(2) = 300
    arr1.foreach(println)

    //3 数组组合
    val my_arr: Array[String] = Array.concat(arr, arr_)
    my_arr.foreach(println)

    //4 fill快捷创建数组，创建长度5,元素全部初始化维"hello"
    val my_arr1: Array[String] = Array.fill(5)("hello")

    //5 二维数组
    val arr2 = new Array[Array[Int]](3)
    arr2(0) = Array[Int](1,2,3)
    arr2(1) = Array[Int](4,5,6)
    arr2(2) = Array[Int](7,8,9)
    for (arr<-arr2; a<-arr){
        println(a)
    }
    //arr2.foreach(arr=>arr.foreach(println))

    //scala自带的ArrayBuffer
    import scala.collection.mutable.ArrayBuffer
    val my_arr3 = ArrayBuffer[Int](1,2,3)
    my_arr3.+=(4)
    my_arr3.foreach(println)
    my_arr3.+=:(100)
    my_arr3.foreach(println(_))
    my_arr3.appendAll(Array[Int](1000, 2000, 3000))
    my_arr3.foreach(println)

  }
}
