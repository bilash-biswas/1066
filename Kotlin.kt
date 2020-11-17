import java.util.Scanner

fun main(args: Array<String>){
    val input = Scanner(System.`in`);
    var a:Int;
    var even:Int;
    even = 0
    var positive:Int;
    positive = 0
    var negative:Int;
    negative = 0

    for(i in 1..5)
    {
        a = input.nextInt();
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
    System.out.printf("%d valor(es) par(es)\n", even);
    System.out.printf("%d valor(es) impar(es)\n", odd);
    System.out.printf("%d valor(es) positivo(s)\n", positive);
    System.out.printf("%d valor(es) negativo(s)\n", negative);
}
