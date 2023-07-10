import scala.io.StdIn

object Question_1_2 {
  def main(args: Array[String]): Unit = {

    //Question 01
    println("------------------QUESTION 01----------------------");
    print("Enter a number:");
    var input = StdIn.readInt();
    println("Is the input prime?" + prime(input));

    //Question 02
    println("------------------QUESTION 02----------------------");
    println("All prime numbers less than the input :");
    print("\t Input:");
    var num = StdIn.readInt();
    primeSeq(num);
  }

  //Function 01
  def GCD(num1: Int, num2: Int): Int = num2 match {
    case num2 if num2 == 0 => num1
    case num2 if (num2 > num1) => GCD(num2, num1)
    case _ => GCD(num2, num1 % num2)
  }

  def prime(n: Int, i: Int = 2): Boolean = n match {
    case n if (n == i) => true;
    case n if (GCD(n, i) > 1) => false;
    case _ => prime(n, i + 1);

  }

  //Function 02
  def primeSeq(i: Int): Unit = {
    if (i < 2) {
      return 0;
    }
    primeSeq(i - 1);
    if (prime(i)) {
      print(i + " ");
    }
  }


}
