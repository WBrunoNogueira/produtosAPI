# produtosAPI

🧩 Projeto CRUD com Spring Boot e H2 Database

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) desenvolvida em Java 21 utilizando o Spring Boot, com persistência de dados em um banco de dados em memória H2.
O objetivo é demonstrar o funcionamento de uma API RESTful completa, aplicando boas práticas de desenvolvimento com o Spring Framework, Spring Data JPA e arquitetura limpa.

🚀 Tecnologias Utilizadas

Java 21

Spring Boot 3+ (Spring Web, Spring Data JPA)

H2 Database (banco de dados em memória)

Maven (gerenciador de dependências)

Lombok (para reduzir código boilerplate)

Swagger / SpringDoc OpenAPI (para documentação da API — opcional)

🧠 Funcionalidades

A aplicação permite realizar as principais operações CRUD:

Criar (Create): adicionar novos registros

Ler (Read): listar todos os registros ou consultar por ID

Atualizar (Update): editar registros existentes

Excluir (Delete): remover registros do banco

Essas operações estão disponíveis através de endpoints REST, seguindo convenções de design de APIs RESTful.

🗄️ Configuração do Banco de Dados (H2)

O projeto utiliza o H2 Database em modo em memória (in-memory), ideal para testes e desenvolvimento.
A configuração está definida no arquivo application.yml:

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

🔍 Detalhes da configuração

Banco em memória: jdbc:h2:mem:produtos

Usuário: sa

Senha: password

Console Web H2: habilitado em http://localhost:8080/h2-console

Use as credenciais abaixo para se conectar:

Campo	Valor
JDBC URL	jdbc:h2:mem:produtos
Usuário	sa
Senha	password
⚙️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/seu-usuario/nome-do-projeto.git


Acesse o diretório do projeto:

cd nome-do-projeto


Execute o projeto com o Maven:

mvn spring-boot:run


Acesse o console do H2:

http://localhost:8080/h2-console

📘 Endpoints Principais
Método	Endpoint	Descrição
POST	/api/produtos	Cria um novo produto
GET	/api/produtos	Lista todos os produtos
GET	/api/produtos/{id}	Consulta um produto por ID
PUT	/api/produtos/{id}	Atualiza um produto existente
DELETE	/api/produtos/{id}	Exclui um produto
🧑‍💻 Autor

Wenderson Bruno Alves Nogueira
Desenvolvedor Java | Spring Boot | APIs REST | H2
📧 Contato: [seuemail@exemplo.com
]
💼 LinkedIn: linkedin.com/in/seu-perfil

Quer que eu adicione agora uma seção de exemplos de requisições (JSON) para os endpoints, mostrando como criar e atualizar um produto? Isso deixaria o README pronto para ser publicado no GitHub.
