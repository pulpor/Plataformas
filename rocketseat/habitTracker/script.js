//document = documento do html

//O "querySelector" é uma função que permite selecionar um elemento HTML através de sua classe, id ou tag.
//Ele retorna o primeiro elemento que corresponde ao seletor especificado.

/* O "querySelector" é uma função que permite selecionar um elemento HTML através de sua classe,
id ou tag. Ele retorna o primeiro elemento que corresponde ao seletor especificado.

A const form está selecionando o elemento HTML com o id "form-habits" 
e atribuindo-o à variável "form". A partir deste ponto, essa variável "form" 
pode ser usada para acessar e manipular esse elemento HTML selecionado.  */

const form = document.querySelector("#form-habits")
const nlwSetup = new NLWSetup(form)
const button = document.querySelector("header button")

//adicionando um evento, e uma função (click)
//a variavel button, add é o nome da função e click é oq ela fará
button.addEventListener("click", add)
form.addEventListener("change", save) //sempre q o forms for mudado faça a função save

function add() {
  const today = new Date().toLocaleDateString("pt-br").slice(0, -5)
  const dayExits = nlwSetup.dayExists(today)

  //toda função que encontra a palavra 'return' para o código
  if (dayExits) {
    alert("dia já incluso! 🔴")
    return
  }

  alert("adicionado com sucesso! 🟢")
  nlwSetup.addDay(today)
}

//localStorage guarda os caches no browser
function save() {
  localStorage.setItem("cookies", JSON.stringify(nlwSetup.data))

  // console.log(nlwSetup.data)
}
const data = JSON.parse(localStorage.getItem("cookies")) || {}

nlwSetup.setData(data)
nlwSetup.load()
