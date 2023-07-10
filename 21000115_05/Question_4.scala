import scala.io.StdIn

object Question_4 {
  def main(args: Array[String]): Unit = {
    // Question 04
    println("------------------QUESTION 04----------------------");
    print("Enter a number:");
    var M = StdIn.readInt();
    println("Check whether the input number is even:" + isEven(M));
  }

  //Function 04
  def isEven(i: Int): Boolean = i match {
    case 0 => true;
    case _ => isOdd(i - 1);
  }

  def isOdd(i: Int): Boolean = {
    !isEven(i);
  }

}
