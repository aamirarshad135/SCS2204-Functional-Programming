import scala.io.StdIn

object code {

  def main(args: Array[String]): Unit = {

    println("----------------Calculating the interest---------------")
    //val depositAmount: Double = 250000
    println("Enter the deposited amount (in Rs.):")
    val depositAmount: Double = StdIn.readDouble()

    val interestAmount: Double = calculateInterest(depositAmount)
    println("Interest Amount: Rs." + interestAmount)
  }
  
  def calculateInterest: Double => Double = (depositAmount: Double) => { //Lambda Function
    //This is equivalent to defining a regular function, but it's assigned to a value directly.
    val interestRate: Double = depositAmount match {
      case amount if amount <= 20000 => 0.02
      case amount if amount <= 200000 => 0.04
      case amount if amount <= 2000000 => 0.035
      case _ => 0.065
    }

    depositAmount * interestRate
    }
}