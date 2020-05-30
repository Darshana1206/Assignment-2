package Assignment

object Q5 {
  def main(args:Array[String])
  {
    print(profit(5),profit(10),profit(15),profit(25),profit(40))
  }
  def attendees(tikPrice:Int)={
    120+(15-tikPrice)/5*20
  }
  def revenue(tikPrice:Int)={
    attendees(tikPrice)*tikPrice
  }
  def cost(tikPrice:Int)={
    500+3*attendees(tikPrice)
  }
  def profit(tikPrice:Int)={
    revenue(tikPrice)-cost(tikPrice)
  }
}