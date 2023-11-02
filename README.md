# Projeto de Autenticação Básica com Spring Boot e MySQL

Este projeto é uma demonstração de um sistema de autenticação básica desenvolvido em Spring Boot 3.0.6, utilizando Java 17 e o banco de dados MySQL na versão 8.0.33. Ele foi criado para ilustrar como configurar e utilizar o Spring Security com autenticação básica em uma aplicação web.

## Tecnologias Utilizadas
- API REST Full, JpaRepository
- Spring Security: AuthenticationProvider, SecurityFilterChain, BCryptPasswordEncoder
- HashMap e Spring Exception Handler (em andamento)
- Spring Boot 3.0.6
- Java 17
- Banco de Dados MySQL 8.0.33

## Instruções de Configuração
Para configurar o ambiente de desenvolvimento local, é necessário ter as seguintes configurações:
- Java 17 instalado
- Maven instalado
- Um ambiente de desenvolvimento integrado (IDE) de sua escolha

## Instruções de Instalação
Para instalar as dependências do projeto, execute o seguinte comando:

```bash
mvn clean install
```

## Configuração do Banco de Dados

A configuração do banco de dados é feita no arquivo `application.yml`, que define as propriedades de conexão com o SQL Server. As principais configurações incluem o URL do banco de dados, nome de usuário e senha para acesso ao banco de dados:

```yaml
spring:
  datasource:
    url: jdbc:sqlserver://server-spring-boot.database.windows.net:1433;database=db-basic-auth;user=server-root@server-spring-boot;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
    username: server-root
    password: Teste@123
  jpa:
    hibernate.ddl-auto: update
    properties.hibernate.show_sql: true
    properties.hibernate.dialect: org.hibernate.dialect.SQLServer2012Dialect
```

## Estrutura de Dados

O projeto inclui uma pasta chamada `database` que contém scripts SQL para criar e popular tabelas no banco de dados. Por exemplo, um script para inserir um registro de cliente na tabela `customer` é fornecido:

```roomsql
INSERT INTO customer (customer_login, customer_name, customer_password)
VALUES ('rayana', 'Rayana Ribeiro Bonfanti', '$2a$12$kTuROdFqFJCjKkXad2qPi.QKX5ws.Lxw/kH45RV8wAsiKIQnBR1Su');
```

## Como Executar o Projeto

Siga estas etapas para executar a aplicação:

1. **Configure o arquivo `application.yml`** com as informações de conexão com o banco de dados.

2. Execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```

## Teste e Documentação 

Para testar a funcionalidade de autenticação básica, um arquivo de coleção do Postman é fornecido na pasta `collection`. O arquivo `basic-auth-spring-with-mysql.postman_collection.json` contém solicitações de exemplo para autenticação e acesso a recursos protegidos.

- **login - with basic auth**: Esta solicitação utiliza a autenticação básica, fornecendo um nome de usuário e senha, e acessa o endpoint de login.
- **getAll - without basic auth**: Esta solicitação não utiliza autenticação e acessa um endpoint para recuperar todos os clientes.

Documentação API do Swagger em andamento.

## Configuração de Segurança

O projeto utiliza o Spring Security para configurar as regras de autenticação e autorização. Ele permite que o endpoint de login (`/authentication/login`) seja acessado somente por usuários autenticados e permite o acesso ao endpoint para recuperar todos os clientes (`/api/customer/getAllCustomers`) sem autenticação.

```
.requestMatchers("/authentication/login").authenticated()
.requestMatchers("/api/customer/getAllCustomers").permitAll()
```

## Uso

- O endpoint `/authentication/login` requer autenticação básica (Basic Auth) para fazer login. Forneça um nome de usuário e senha válidos para acessar este endpoint.
- O endpoint `/api/customer/getAllCustomers` permite o acesso sem autenticação e recupera todos os clientes.

## Estrutura do Projeto

O projeto segue uma estrutura organizada com as pastas para controle de entidades, serviços, controladores, configurações e segurança.

## Autores e Contribuidores

Rayana Ribeiro Bonfanti

## Status do Projeto
Versão atual: 0.0.1-SNAPSHOT

## Contato
Para mais informações, entre em contato com [rayanabonfanti@gmail.com].

## Contribuições

Fique à vontade para contribuir para este projeto, seja adicionando recursos, corrigindo bugs ou aprimorando a segurança da autenticação, assim que feito, pode abrir um pull request que irei analisar o código para uma possível branch ser adicionada com suas alterações. Sua contribuição é bem-vinda!

Agradecemos a todos que contribuíram e nos inspiraram a criar este projeto.

Este é um projeto de exemplo que visa ajudar a compreender a configuração do Spring Security para autenticação básica em uma aplicação Spring Boot. É uma base sólida para criar aplicativos mais complexos com recursos de autenticação e segurança.
