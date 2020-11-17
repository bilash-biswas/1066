var
a,negative,odd,positive,even:int64;
i:integer;
begin
   negative := 0;
   positive := 0;
   even := 0;
   for i := 1 to 5 do
   begin
      read(a);
      if((a mod 2) = 0)then
         even := even + 1;
      if(a > 0)then
         positive := positive + 1;
      if(a < 0)then
         negative := negative + 1;
   end;
   odd := 5 - even;
   writeln(even ,' valor(es) par(es)');
   writeln(odd ,' valor(es) impar(es)');
   writeln(positive ,' valor(es) positivo(s)');
   writeln(negative ,' valor(es) negativo(s)');
end.
