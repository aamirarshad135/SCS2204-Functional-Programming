import scala.io.StdIn

object code {

  def main(args: Array[String]): Unit = {
    println("-------------Pattern Matching----------------")
    println("Enter an integer:");
    val input: Int = StdIn.readInt();

    println("Output :" + classifyNumber(input))
    
  }
  val classifyNumber: Int => String = (num: Int) => num match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }
}