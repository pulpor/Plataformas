//IEEE 754-2008 (Padrão do JS para casas decimais)

let n1 = 1; //number
let n2 = 2.5 // number - semrpe com pontos, não virgulas 

// string + number = não é realizada a conta e sim a concatenação
console.log ( n1.toString () + n2 ); // transforma em string somente na operação


console.log (typeof n1);   // pra saber se o tipo foi convertido em string


//se quisesse mesmo alterar para string para sempre:
n1 = n1.toString();
console.log (typeof n1);


n3 = 1500;
//se eu quiser a versão binária
console.log (n3.toString(2));


n4 = 10.54789545123665478;
//se eu quiser arredondamento nas decimais
console.log (n4.toFixed(2));

//perguntar se o numero é inteiro
console.log(Number.isInteger(n3));  // true = numero inteiro
console.log(Number.isInteger(n4));  // false = não é inteiro

n5 = 'ola';
//perguntar se é um numero (is Not A Number?)
console.log(Number.isNaN(n3));  // false = é um numero
console.log(Number.isNaN(n5));  // true = não é um numero



n6 = 0.7
n7 = 0.1

n6 += n7;  // n6 = n6 + n7   //0.79999
console.log(n6)

n6 += n7;  // 0.9
n6 += n7;  // 1.0
n6 += n7;  // 1.1

console.log(n6);

n6 = n6.toFixed (2);  //arredondamento de duas casas decimais

console.log(n6); 

