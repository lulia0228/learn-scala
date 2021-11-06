package com.xuexi.scala

import java.util.Date

object Lesson_function {

  def main(args: Array[String]): Unit = {
    /**
     * （1）方法体中最后返回值可以使用return, 如果使用了return一定要指定方法的返回值类型
     * （2）如果未使用return， 默认会将方法体最后一行计算的值返回，
     *     此时方法可以省略返回值类型，会自动推断类型
     * （3）定义方法，传入的参数一定要指定类型
     * @return
     */
//    1.简单方法
//    def max(a:Int, b:Int): Int={
//      if (a>b){
//        return a
//      }else{
//        return b
//      }
//    }

//    def max(a:Int, b:Int):Int={
//      if (a>b) a else b
//    }

//    def max(a:Int, b:Int):Int = if(a>b) a else b
//    val result = max(10, 20)
//    println(result)

//    2.递归方法(需要显式指定方法返回值类型)
    def func(num:Int):Int={
      if(num==1){
        1
      }else{
        num*func(num-1)
      }
    }
    val res = func(num = 5)
    println(res)

//    3.参数有默认值(
    def add(a:Int=10, b:Int=20):Int={
      a+b
    }
    val res1 = add(b=100)
    println(res1)

//    4.变长参数
    def pstr(s:String*): Unit ={
      //传进去匿名函数
      //s.foreach(elem=>{println(elem)})
      //只有一个参数，可以更简化的写法
      s.foreach(println(_))
//      for(elem<-s){
//        println(elem)
//      }
    }
    pstr("hello", "world", "wolf")

//    5.匿名函数
    //多用于方法的参数是函数的时候，传入匿名函数
    def ni_ming:(Int,Int)=>Int=(a:Int, b:Int)=>{
      a+b
    }
    println(ni_ming(10,100))

//    6.嵌套方法
    def qiantao(num:Int):Int = {
      def func(num:Int):Int={
        if(num==1){
          1
        }else{
          num*func(num-1)
        }
      }
      func(num)
    }
    val res3 = qiantao(num = 6)
    println(res3)

//    7.偏应用函数
    //方法频繁调用，且参数多,但是参数传值大多固定不变；定义偏应用函数，调用可以只传变化的参数
    def showLog(date:Date, log:String): Unit ={
      println(s"date is $date, log is $log")
    }
    val date = new Date()
    showLog(date, "aaa")
    //def my_fun:String=>Unit = showLog(date, _:String)
    def my_fun = showLog(date, _: String)
    my_fun("bbb")
    my_fun("ccc")

//    8.高阶函数
    //(1)方法的参数是函数
    def add_f(a:Int, b:Int): Int ={
      a+b
    }
    def h_o_f1(f:(Int,Int)=>Int, s:String):String={
      val i = f(100, 30)
      i+"#"+s
    }
    val ho_res: String = h_o_f1(add_f, "hello")
    //val ho_res = h_o_f1((a:Int,b:Int)=>{a+b}, "hello") //匿名函数传
    println(ho_res)

    //(2)方法的返回是函数
    def h_o_f2(s:String):(String, String)=>String={
      def func_re(s1:String, s2:String): String ={
        s1+"~"+s2+"#"+s
      }
      func_re
    }
    println(h_o_f2("hello")("A", "B"))

    //(3)方法的参数和返回都是函数
    def h_o_f3(f:(Int, Int)=>Int):(String, String)=>String={
      val i: Int = f(3, 4)
      def re_func(s1:String,s2: String)={
        s1 +"@" + s2 + "*" + i
      }
      re_func
    }
    val str: String = h_o_f3((a, b) => {a * b})("A", "B")
    println(str)

//    9.柯里化函数(定义隐式转换会用到)
    def keli_func(a:Int, b:Int)(c:Int, d:Int):Int={
      a+b+c+d
    }
    println(keli_func(1,2)(3,4))

  }
}
