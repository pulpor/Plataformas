
const nome = "Leonardo";
const sobrenome = "Pulpor";


var idade = 26;
var peso = 75;
var altura = 1.75;
var ano = 2022;

let imc ;           //   ( peso / (altura*altura) )
let nascimento = ano - idade ;


// 📝 "+" não é soma, é concatenação, juntar as palavras
console.log (nome, sobrenome, 'tem', idade + ' anos, e pesa aproximadamente ' +
peso + ' kg ');

console.log ( 'ele tem ' + altura + " metros de altura, e seu IMC é de " + (peso/(altura*altura))  );

console.log (`${nome} nasceu em ${nascimento}`);