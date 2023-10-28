# Projeto SpringMongo
Nesse projeto utilizo Spring boot junto com banco de dados NoSQL MongoDB. Um projeto com banco de dados com tabelas cliente e produto. Ambas com métodos CRUD.

## ⚙️ Como testar:
- Baixe o projeto em sua máquina importando pelo Maven na função "import maven projects"
- Execute pela classe "ProjetoVendasApplication".
## 💻 Testes no Postman:
### Produto:
POST - Criar
```
http://localhost:8080/produtos/criar
{
    "nome": "Produto x",
    "valor": 890,
    "desconto": 0.04
}
```
GET - Obter todos
```
http://localhost:8080/produtos/obterProdutos
```
GET - Obter por ID <br> 
**_OBS: Esse "{id} é só para exemplificar e demonstrar como precisa ser passado. Para testar copie o ID correto gerado pelo MongoDB._**
```
http://localhost:8080/produtos/{id}
```
PUT - http://localhost:8080/produtos/{id}
```
{
    "id": "650c6ac251ac4c344c439285",
    "nome": "Produto x atualizado",
    "valor": 890.99,
    "desconto": 0.04
}
```
DELETE - Excluir
```
http://localhost:8080/produtos/{id}
```
### Clientes:
POST - Criar
```
http://localhost:8080/clientes/criar
{
    "nome": "Fulano",
    "cpf": "000.111.222-33"
}
```
GET - Obter todos
```
http://localhost:8080/clientes/obterTodos
```
GET - Obter por ID <br>
**_OBS: Esse "{id} é só para exemplificar e demonstrar como precisa ser passado. Para testar copie o ID correto gerado pelo MongoDB._**
```
http://localhost:8080/clientes/{id}
```
PUT - Atualizar 
```
http://localhost:8080/clientes/{id}
 {
        "id": "650c93a451ac4c344c4392ae",
        "nome": "Fulano atualizado",
        "cpf": "125.000.214-33"
}
```
DELETE - Excluir 
```
http://localhost:8080/clientes/{id}
```
## 📢 Para visualização no MongoDB
Inicie o mongo e faça o comando:
```
show dbs
 ```
Irá aparecer o banco de projetoVendas, então selecione:
```
use projetoVendas
```
Para mostrar as tabelas:
```
show collections
```
Para mostrar os dados de clientes:
```
db.cliente.find().pretty()
```
Para mostrar os dados de produtos:
```
db.produto.find().pretty()
```
### Imagens utilizando MongoDB
![image](https://github.com/llary-y/projetoSpringMongo/assets/141759410/d0188159-53ea-4fd9-a490-c4af737c90fb) <br> <br>
![image](https://github.com/llary-y/projetoSpringMongo/assets/141759410/92209ebf-723c-4d6c-acf6-75bf93590ca3) <br> <br>
_Obrigada por acessar o repositório. Espero que tenha gostado!_ 👋 


