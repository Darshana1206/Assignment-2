package Assignment

object Q4 {
  def main(args:Array[String])
  {
    
    var sallary:Double=takeHome(40,20)
    print(f"Total sallary=$sallary%.2f")
  }
  
  def normal(hours:Int):Int=hours*150
  def ot(hours:Int):Int=hours*75
  
  def income(h1:Int,h2:Int):Int={
    normal(h1)+ot(h2)
  }
  
  def tax(totalIncome:Int):Double={
     totalIncome*0.1
  }
  def takeHome(h1:Int,h2:Int):Double={
    income(h1,h2)-tax(income(h1,h2))
  }
  
}