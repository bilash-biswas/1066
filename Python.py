negative = 0
positive = 0
even = 0
for i in range(0,5):
    a = int(input())
    if a % 2 == 0 :
        even = even + 1
    if a > 0 :
        positive = positive + 1
    if a < 0 :
        negative = negative + 1
odd = 5 - even;
print("{} valor(es) par(es)".format(even))
print("{} valor(es) impar(es)".format(odd))
print("{} valor(es) positivo(s)".format(positive))
print("{} valor(es) negativo(s)".format(negative))
