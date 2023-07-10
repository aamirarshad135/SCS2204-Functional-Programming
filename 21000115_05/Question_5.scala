import  scala.io.StdIn

object Question_5 {
  def main(args: Array[String]): Unit = {
    // Question 05
    println("------------------QUESTION 05----------------------");
    print("Enter a number:");
    var P = StdIn.readInt();
    println("Addition of all even numbers less than given input:" + sumEven(P));
  }

  //Function 05
  def sumEven(n: Int): Int = n match {
    case n if n <= 0 => return 0;
    case n if n % 2 == 0 => n + sumEven(n - 2);
    case _ => sumEven(n - 1);
  }
}
