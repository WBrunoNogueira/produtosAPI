

# 🧩 produtosAPI - Java 21 / Spring Boot

Este projeto é uma API RESTful desenvolvida em **Java 21** com **Spring Boot**, implementando um **CRUD (Create, Read, Update, Delete)** de produtos.  
A persistência dos dados é feita em um banco **H2 em memória**, ideal para testes e desenvolvimento local.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## ⚙️ Funcionalidades

- **Criar produto** → `POST /produtos`
- **Listar todos os produtos** → `GET /produtos`
- **Buscar produto por ID** → `GET /produtos/{id}`
- **Atualizar produto** → `PUT /produtos/{id}`
- **Excluir produto** → `DELETE /produtos/{id}`

---

## 🗄️ Configuração do Banco de Dados (H2)

O projeto utiliza o **H2 Database** em modo **em memória** (`in-memory`), o que significa que os dados são apagados sempre que a aplicação é reiniciada.  
A configuração está definida no arquivo `application.yml`:

```yaml
spring:
  application:
    name: Produtos API
  datasource:
    url: jdbc:h2:mem:produtos
    username: sa
    password: password
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      enabled: true
      path: /h2-console

```

---

## 🔍 Detalhes da configuração

- **spring.application.name:** → `nome da aplicação (Produtos API)`

- **spring.datasource.url:** → `URL de conexão do banco de dados H2 em memória (jdbc:h2:mem:produtos)`

- **spring.datasource.username / password:** → `credenciais para acesso ao banco (sa / password)`

- **spring.jpa.database-platform:** → `define o dialeto SQL usado pelo Hibernate (H2Dialect)`

- **spring.h2.console.enabled:** → `ativa o console web do H2`

- **spring.h2.console.path:** → `define o caminho de acesso ao console (/h2-console)`

---

## 💻 Acesso ao Console do H2

Após iniciar o projeto, você pode acessar o console web do H2 através do seguinte endereço:

👉 ` http://localhost:8080/h2-console`

Use as credenciais abaixo para se conectar:

| Campo      | Valor                  |
|------------|-----------------------|
| JDBC URL   | jdbc:h2:mem:produtos  |
| Usuário    | sa                    |
| Senha      | password              |


---

## ▶️ Como Executar o Projeto

Clone o repositório


```git clone https://github.com/seu-usuario/nome-do-repositorio.git```


Acesse o diretório do projeto


```cd nome-do-repositorio```


Execute o projeto com o Maven

```mvn spring-boot:run```


A aplicação estará disponível em:

👉 ```http://localhost:8080```


---


## 🧠 Observações

O banco H2 é temporário e os dados são perdidos ao encerrar a aplicação.

Ideal para testes, prototipagem e aprendizado de Spring Boot.

Pode ser facilmente substituído por bancos como PostgreSQL ou MySQL alterando as configurações no application.yml.
