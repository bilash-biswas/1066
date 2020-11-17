import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i,negative = 0,odd,positive = 0,even = 0;
    int[] a = new int[6];
    for(i = 1;i <= 5;i++)
    {
     a[i] = input.nextInt();
    }
    for(i = 1;i <= 5;i++)
    {
         if(a[i] % 2 == 0)
         {
             even = even + 1;
         }

         if(a[i] > 0)
         {
             positive = positive + 1;
         }
         if(a[i] < 0)
         {
             negative = negative + 1;
         }
    }
    odd = 5 - even;
    System.out.printf("%d valor(es) par(es)\n", even);
    System.out.printf("%d valor(es) impar(es)\n", odd);
    System.out.printf("%d valor(es) positivo(s)\n", positive);
    System.out.printf("%d valor(es) negativo(s)\n", negative);
   }
}
