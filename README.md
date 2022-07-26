<h1 align="center">Projeto Alura - Stickers</h1>
<h4 align="center"> 
	Projeto raíz funcional finalizado durante a Imersão Java da Plataforma Alura, possibilidade de melhorias de segmentação no futuro. 🚀
</h4>

### 💻 Sobre o projeto

Projeto Back-end que busca informações no formato JSON da nuvem Heroku, trata esses dados e os transforma em figurinhas.
Esse projeto foi desenvolvido em conjunto com o repositório [alura-linguagens-api](https://github.com/carlosaugustodpacheco/alura-linguagens-api) durante a Imersão Java da Plataforma Alura!


### 🎨 Layout

![image](https://user-images.githubusercontent.com/68930974/181081834-c3b2cb96-4d4e-4bad-b49e-749b581319f4.png)

### 👌 Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina o [Git](https://git-scm.com) e um bom editor para trabalhar com o código, nesse projeto utilizei o [VS-Code](https://code.visualstudio.com/).

É necessario também a instalação do JDK 17 e do Maven. Caso utilize o VS-Code é possivel instalar sua extensão facilitada < [Java Extension](https://code.visualstudio.com/docs/java/extensions) >

O repositório [alura-linguagens-api](https://github.com/carlosaugustodpacheco/alura-linguagens-api) que é responsavel pela tratativa do banco de dados MongoDB não é necessario caso a necessidade seja apenas a criação das figurinhas, poir o arquivo .JAR, assim como o acesso ao banco de dados, desse repositório foi disponiblizado no Heroku e está sendo acessado diretamente por essa API.

### 🎲 Rodando a aplicação

#### Clone este repositório
$ git clone <https://github.com/carlosaugustodpacheco/alura-stickers>

#### Acesso
Acesse a pasta src do projeto dentro do editor e edite a String de saída das figurinha ( campo 34)

#### Execução
Execute o App.java, as figurinhas serão criadas automaticamente dentro da pasta saida na pasta raíz do repositório. 

#### Populando e consultando o banco de dados de imagens
Com o Postman é possivel popular e consultar o banco de dados MonboDB disponibilizado no Heroku.

Para consulta:
```
GET > https://carlos-alura-linguagens-api.herokuapp.com/linguagens
```
Para popular:
```
POST > https://carlos-alura-linguagens-api.herokuapp.com/linguagens
```
Com parametros no "Body" como exemplo abaixo:
```
{
        "title": "Python",
        "image": "https://images.pling.com/img/00/00/08/01/07/1107980/66411-1.png",
        "ranking": 5
    }
```
    
### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- Java
- MongoDB
- Heroku
- Postman

### ✨ Autor
<a href="https://github.com/carlosaugustodpacheco">
 <img style="border-radius: 50%;" src="https://user-images.githubusercontent.com/68930974/181088945-0a13c969-27ee-46b0-86ee-123d7dea7a89.png" width="150px;" alt=""/>
 <br />
 <sub><b>Carlos Augusto Duru Pacheco</b></sub></a> <a href="https://github.com/carlosaugustodpacheco" title="Rocketseat">🚀</a>
 
  Entre em contato! 👋
  
 [![Linkedin Badge](https://img.shields.io/badge/-Carlos-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/carlosaugustodpacheco/)](https://www.linkedin.com/in/carlosaugustodpacheco/) 
[![Gmail Badge](https://img.shields.io/badge/-carlosaugustodpacheco@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:carlosaugustodpacheco@gmail.com)](mailto:carlosaugustodpacheco@gmail.com)

