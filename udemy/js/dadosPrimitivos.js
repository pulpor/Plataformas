// ECMAScript 2015 = padronização do javascript pela empresa ECMA


const nome0 = 'leo'     //string
const nome1 = "leo"     //string
const nome2 = `leo`     //string que posso colocar var dentro

const numeroInteiro = 1 ;   //number
const numeroQuebrado = 1.333333 ;  //number 

let vazio ;   // undefined = não tem valor dentro
let vazio2 = null ; // null = o valor é definido pela configuração do usuário

const aprovado = true ;  // boolean = true, false (lógico)

console.log (typeof aprovado, vazio, vazio2);


// string, number, undefinid, null, boolean, symbol
// são dados primitivos


let conversao0 = parseInt ( '5.3 ')    // converte para numero inteiro 

let conversao = 'L5' ;  //string
let conversao2 = Number ( '5' ) ;  // converteu para number 

console.log (typeof aprovado, vazio, vazio2, conversao2);
//NaN = not a number 

console.log (conversao2 + 5)


