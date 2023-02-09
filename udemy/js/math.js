
n1 = 9.49

let n2 = Math.floor (n1);  //arredondamento p baixo
console.log (n2);


let n3 = Math.ceil (n1); //arredondamento p cima
console.log (n3);


let n4 = Math.round (n1);  // arredondamento seguindo a regra do 5 (médio)
console.log (n4);


//mostra o maior numero da sequencia
console.log (Math.max (0,1,2,3,4,5,6,7,8,9,-50,50));


//mostra o menor numero da sequencia
console.log (Math.min (0,1,2,3,4,5,6,7,8,9,-50,50));


//mostra um numero aleatório
console.log (Math.random());


//numero aleatorio entre 10 e 5
const aleatorio = Math.random() * (10 - 5) + 5;
console.log (aleatorio);

//numero aleatorio entre 10 e 5 arredondado
const aleatorio2 = Math.round (Math.random() * (10 - 5) + 5);
console.log (aleatorio2);

//2 elevado a 10 potência 
console.log (Math.pow (2, 10))
//ou
console.log (2 ** 10) ;


n5 = 9

//para fazer raíz quadrada
console.log (n5 ** 0.5)  ;
console.log (n5 ** (1/2))  ; 