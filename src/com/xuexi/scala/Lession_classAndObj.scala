package com.xuexi.scala

/*
scala object相当于java中的单例/工具类；内部定义的全是静态
scala 类中可以传参，传参就有了构造函数，传参一定要有类型，还可以加上是否可变(val/var)
scala 类中属性默认有getter和setter方法(对比java获取类中属性)
scala 类中重写构造时候，构造中第一行必须首先调用默认的构造， 构造 def this(...){...}
scala new一个类的时候，除了类中的方法【除了构造方法】不执行，其它的都会执行
同一个scala文件中，如果class名和object名一样，互相称为对方的伴生类和伴生对象，二者之间可以互相访问私有变量
scala object不可以传参，如果传了，说明在对应的object中写了apply方法，apply可重载
 */

class Person(xname:String, xage:Int){
  val name: String = xname //前面加private会变成私有 private val name = xname
  val age: Int = xage
  var gender = 'M'

  //重写构造
  def this(xname:String, xage:Int, xgender:Char){
    this(xname, xage)
    this.gender = xgender
  }

  def say_name()={
    println(name)
    println("hello world."+Lession_classAndObj.name)
  }
}

object Lession_classAndObj {
  val name = "李四" //静态属性
  def main(args:Array[String])={
    val a: Int = 1000
    var b = 200
    b = 300
    println(a, b)
    val p = new Person(xname = "张三", xage = 16)
    println(p.age, p.name, p.gender)
    p.say_name()
    val p1 = new Person(xname = "王五", xage = 18,  xgender = 'F' )
    println(p1.age,p1.name, p1.gender)
    p1.say_name()

    // scala中写循环
    // until to 是scala中的操作符，可以这样写 1.to(10)
    for(i <- 1 until 10){
      println(i)
    }
    for(i <- 1 to 10){
      println(i)
    }

  }
}
