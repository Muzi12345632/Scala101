"Hello world"

case class Hello(name: String, age: Int)

val welcome = new Hello("Muziwandile",25)

print(welcome)

object Hey{
  def sayHello(name:String): Unit ={
    //print("Muziiwandile")
  }
}

Hey.sayHello("muzi")