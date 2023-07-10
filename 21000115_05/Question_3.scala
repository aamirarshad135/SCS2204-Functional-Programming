import scala.io.StdIn

object Question_3 {
  def main(args: Array[String]): Unit = {
    // Question 03
    println("------------------QUESTION 03----------------------");
    print("Enter a number:");
    var N = StdIn.readInt();
    println("Addition of numbers from 1 to N:" + sum(1, N));
  }

  //Function 03
  def sum(n: Int, m: Int): Int = {
    if (m >= n) {
      n + sum(n + 1, m);
    }
    else {
      return 0;
    }
  }
}
