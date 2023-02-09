
const frutas  = ['banana', 'maçã', 'laranja', 'uva', 'kiwi'];
console.log (frutas);

console.log (frutas[0]);   //banana

frutas [0] = 'pera';    //editando o indíce 0
console.log (frutas);

frutas [5] = 'limão'  //incluindo mais um em ordem especifica
console.log (frutas);

console.log (frutas.length); // comprimento / quantidade do array 

frutas[frutas.length] = 'morango';  //incluindo mais um

frutas.push ('banana'); //incluindo mais um, no final

frutas.unshift ('melancia'); //colocando o elemento no inicio 

//frutas.pop(''); //eliminando um elemento do final [banana]


console.log (frutas);

removido = frutas.pop();  //ver qual elemento foi removido
console.log (removido);
console.log (frutas);

delete frutas [1]; //deletando indice 1
console.log (frutas);

console.log(frutas.slice(0,3)); //fatiar do 0 até o 2

console.log(typeof frutas);  //arrays são objects 

// é uma instancia ? true é array, false não é array 
console.log(frutas instanceof Array); 
