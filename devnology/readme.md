# Guia de uso da API para gerenciamento de links
Esta é uma API para gerenciar links, com a URL e um título/label. Ela permite que os links sejam adicionados, editados e excluídos.

## Requisitos:

* Python 3.x
* Flask

## Instalação:

1. Clone o repositório desta API em seu ambiente de desenvolvimento.

~~~ bash
git clone https://github.com/seu-usuario/sua-api.git
~~~

2. Instale as dependências usando o pip.
~~~
pip install -r requirements.txt
~~~
## Execução:

1. Inicie o servidor Flask executando o seguinte comando na pasta raiz do projeto.

~~~
flask run
~~~

2. Acesse a API usando o seu navegador web ou uma ferramenta de teste de API, como o Postman, na seguinte URL:
~~~javascript

http://localhost:5000/
~~~
## Rotas:

A API fornece as seguintes rotas para gerenciar links:

* <b>GET /</b>: Retorna uma lista de todos os links gerenciados pela API.
* <b>POST /</b>: Adiciona um novo link à lista de links gerenciados pela API. É necessário enviar um corpo JSON com as seguintes propriedades:
url: URL do link a ser adicionado.
title: Título ou label do link a ser adicionado.
* <b>PUT /<id></b>: Atualiza um link existente na lista de links gerenciados pela API. É necessário enviar um corpo JSON com as seguintes propriedades:
url: Nova URL para o link.
title: Novo título ou label para o link.
* <b>DELETE /<id></b>: Remove um link da lista de links gerenciados pela API.

## Considerações finais:

Este é um exemplo básico de uma API para gerenciar links. Ela pode ser estendida e melhorada para atender a suas necessidades específicas. Se tiver alguma dúvida ou precisar de ajuda, não hesite em entrar em contato.
