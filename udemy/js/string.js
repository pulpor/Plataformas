
//            0123456789
let string = "um texto qualquer"
console.log(string[4]);


console.log(string.charAt(6));  
// charAt  identifica qual o caractere naquela posição


// .concat faz exatamente oq o sinal de + faz kkk  [concatenação]
console.log (string.concat(' em um lindo dia'));  
console.log (string + ' em um lindo dia');  
console.log (`${string} em um lindo dia`);  


// qual indice começa tal palavra 
console.log (string.indexOf('qualquer'));  

// qual indice começa tal palavra depois de tal indice
console.log (string.indexOf('qualquer', 3));  

// qual indice começa tal letra depois de tal indice
console.log (string.indexOf('t', 7));  
// quando dá "-1" é pq nao encontrou o valor. 

// qual indice começa tal palavra 
console.log (string.search('qualquer'));  


// trecho de expressão regular que solicita letras minuscula com flag "g"
console.log (string.match(/[a-z]/g));  


// troca um palavra por outra 
console.log (string.replace('qualquer', 'lindão'));  

// conta quantos caracteres tem
console.log (string.length);  

// slice é fatiar, de tal caractere até tal caractere
console.log (string.slice(2, 10));  

//separa a partir de tal caractere
console.log (string.split(' ')); // a partir do " " separa o restante
console.log (string.split('r')); // a partir do "r" separa o restante
console.log (string.split('x')); // a partir do "x" separa o restante

//separa o "x" a partir do indice 3 
console.log (string.split('x', 3)); 

console.log (string.toLowerCase());  //minusculas
console.log (string.toUpperCase());  //maiusculas


