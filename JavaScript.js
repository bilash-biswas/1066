var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var a = [];
var i,positive = 0,negative = 0,even = 0,odd = 0;
for(i = 0;i < 5;i++){
    a.push(parseInt(lines.shift()));
}
for(i = 0;i < 5;i++){
    if (a[i] % 2 === 0) {
      even++;
    }
    else if(a[i] !== 0){
        odd++;
    }
    if(a[i] > 0){
        positive++;
    }
    else if(a[i] < 0){
        negative++;
    }
}
console.log(even + " valor(es) par(es)");
console.log(odd + " valor(es) impar(es)");
console.log(positive + " valor(es) positivo(s)");
console.log(negative + " valor(es) negativo(s)");
