# Projeto de Autenticação com Okta OAuth 2.0 e Spring Boot

Este projeto é uma demonstração de um sistema de autenticação utilizando Okta como provedor de identidade e o protocolo OAuth 2.0. O projeto utiliza Spring Boot 2.1.4.RELEASE com Java 8 e Spring Cloud.

## Tecnologias Utilizadas
- Spring Boot 2.1.4.RELEASE
- Java 8
- Spring Cloud Greenwich.SR2
- Okta Spring Boot Starter 0.6.0

## Instruções de Configuração
Para configurar o ambiente de desenvolvimento local, é necessário ter as seguintes configurações:
- Java 1.8 instalado
- Maven instalado
- Um ambiente de desenvolvimento integrado (IDE) de sua escolha

1. **Configure o arquivo `application.properties`** com as informações de configuração do Okta e outras configurações necessárias:

```yaml
okta.oauth2.issuer=https://dev-44887216.okta.com/oauth2/default
okta.oauth2.clientId=0oaas1puwupUH9LcY5d7
okta.oauth2.clientSecret=U2DW-0v5QFJwyLOwk1tEzcXqj6eWcwISrNCrd5IIFhfJMcm8PpBC9F7znsDbGT3V
server.port=9090
spring.main.allow-bean-definition-overriding=true
```

## Instruções de Instalação
Para instalar as dependências do projeto, execute o seguinte comando:

```bash
mvn clean install
```

## Como Executar o Projeto

Siga estas etapas para executar a aplicação:

1. **Configure o arquivo `application.properties`** com as informações de conexão com o banco de dados.

2. Execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```

## Teste e Documentação

Documentação API do Swagger em andamento.

## Uso

Acesse o endpoint `/` para receber uma saudação personalizada com base no nome do usuário autenticado. Certifique-se de estar autenticado para acessar este endpoint.


## Estrutura do Projeto

O projeto segue uma estrutura em andamento.

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

