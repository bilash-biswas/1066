a = Array.new()
for j in 1..5
  a[j] = gets().chomp().to_i
end
even = 0
odd = 0
positive = 0
negative = 0
for j in 1..5
  if a[j] % 2 == 0
    even = even + 1
  else
    odd = odd + 1
  end
  if a[j] > 0
    positive = positive + 1
  elsif a[j] < 0
    negative = negative + 1
  end
end
printf("%d valor(es) par(es)\n", even);
printf("%d valor(es) impar(es)\n", odd);
printf("%d valor(es) positivo(s)\n", positive);
printf("%d valor(es) negativo(s)\n", negative);
