array = {}
even = 0
odd = 0
positive = 0
negative = 0
for i = 1,5 do
    array[i] = io.read("*n")
end
for i = 1,5 do
    if array[i] % 2 == 0 then
        even = even + 1
    elseif array[i] % 2 ~= 0 then
        odd = odd + 1
    end
    if array[i] > 0 then
        positive = positive + 1
    elseif array[i] < 0 then
        negative = negative + 1
    end
end
print(even.." valor(es) par(es)")
print(odd.." valor(es) impar(es)")
print(positive.." valor(es) positivo(s)")
print(negative.." valor(es) negativo(s)")
