#include<stdio.h>
int main()
{
    int i,j,negative = 0,odd,positive = 0,even = 0;
    int a[6];
    for(i = 1;i <= 5;i++)
    {
        scanf("%d",&a[i]);
    }
    for(j = 1,i = 1;j <= 5,i <= 5;j++,i++)
    {
           if(abs(a[i] % 2 == 0))
           {
               even = even + 1;
           }
           if((a[i]) > 0)
           {
               positive = positive + 1;
           }
           if((a[i]) < 0)
           {
               negative = negative + 1;
           }
    }
    odd = 5 - even;
    printf("%d valor(es) par(es)\n", even);
    printf("%d valor(es) impar(es)\n", odd);
    printf("%d valor(es) positivo(s)\n", positive);
    printf("%d valor(es) negativo(s)\n", negative);
    return 0;
}
