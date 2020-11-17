using System.IO;
using System;

class Program
{
    static void Main()
    {
    int i,negative = 0,odd,positive = 0,even = 0;
    int a;
    for(i = 1;i <= 5;i++)
    {
         a = Convert.ToInt32(Console.ReadLine());
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
    odd = 5 - even;
    Console.WriteLine(even + " valor(es) par(es)");
    Console.WriteLine(odd + " valor(es) impar(es)");
    Console.WriteLine(positive + " valor(es) positivo(s)");
    Console.WriteLine(negative + " valor(es) negativo(s)");
    Console.ReadLine();
    }
}

 
