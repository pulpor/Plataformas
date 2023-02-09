
//dentro do parenteses, vai "parametros", como o 'nome'
//parametros são como variaveis
function saudacao (nome)  {

    console.log (`bom dia ${nome}!`);
    
}

//aqui eu coloco o valor que vai no parametro 
saudacao('leonardo');
saudacao('felipe');
saudacao('góes');
saudacao('pulpor');



function soma (x,y) {

    const resultado = x + y ;
    return resultado

}

console.log (soma (2,2));
console.log (soma (5,-6));
console.log (soma (0,1.2));




function soma2(x=1.5 , y=5)  {

const resultado2 = x + y;
return resultado2;

}
const resultado2 = soma2 ()
console.log (resultado2)