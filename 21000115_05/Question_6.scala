import scala.io.StdIn

object Question_6 {
  def main(args: Array[String]): Unit = {
    // Question 06
    println("------------------QUESTION 06----------------------");
    println("First n fibbonacci numbers for given n:");
    print("\t Input:");
    var F = StdIn.readInt();
    FibonaciSeq(F);
  }

  //Function 06
  def Fibonacci(i: Int): Int = i match {
    case 0 => 0;
    case i if (i == 1) => 1;
    case _ => Fibonacci(i - 1) + Fibonacci(i - 2);
  }

  def FibonaciSeq(i: Int): Unit = {
    if (i > 0) {
      FibonaciSeq(i - 1);
    }
    print(Fibonacci(i) + " ");

  }

}

