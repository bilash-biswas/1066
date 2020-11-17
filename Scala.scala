import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var even:Int = 0
    var positive:Int = 0
    var negative:Int = 0

    for(i <- 1 to 5)
    {
        var a = input.nextInt();
        if(a % 2 == 0)
        {
            even = even + 1;
        }

        if(a > 0)
        {
            positive = positive + 1;
        }
        if(a < 0)
        {
            negative = negative + 1;
        }
    }
    var odd:Int = 5 - even;
    println("%d valor(es) par(es)".format(even))
    println("%d valor(es) impar(es)".format(odd))
    println("%d valor(es) positivo(s)".format(positive))
    println("%d valor(es) negativo(s)".format(negative))
    }
}

 
